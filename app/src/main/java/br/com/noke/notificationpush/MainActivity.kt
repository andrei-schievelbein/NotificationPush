package br.com.noke.notificationpush
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import br.com.noke.notificationpush.notification.NotificationPush
import br.com.noke.notificationpush.ui.theme.NotificationPushTheme


class MainActivity : ComponentActivity() {

    private lateinit var notificationHelper: NotificationPush

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val requestPermissionLauncher = registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted: Boolean ->
            if (!isGranted) {
                Toast.makeText(this, "Permissão de notificação não concedida.", Toast.LENGTH_SHORT).show()
            }
        }

        notificationHelper = NotificationPush(this, requestPermissionLauncher)
        notificationHelper.createNotificationChannel()
        notificationHelper.requestNotificationPermission()

        setContent {
            NotificationPushTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize()) {
                    NotificationButton(
                        notificationHelper,
                        title = "Simulando notificação push",
                        text = "Teste de notificação push."
                    )
                }
            }
        }
    }
}

@Composable
fun NotificationButton(notificationHelper: NotificationPush, title: String, text: String) {
    Column (modifier = Modifier
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Button(
            onClick = { notificationHelper.sendNotification(title, text) },
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
        ) {
            Text(text = "Clique")
        }
    }
}
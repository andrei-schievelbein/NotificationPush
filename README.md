# 🚀 NotificationPush

**NotificationPush** é um projeto Android desenvolvido em Kotlin que demonstra como configurar e enviar notificações push locais. Ele utiliza o Jetpack Compose para a interface do usuário e abrange as principais funcionalidades para criar um canal de notificação, solicitar permissões e disparar notificações personalizadas.

## 📋 Funcionalidades

### Criação de Canal de Notificação
- Garante que as notificações sejam entregues corretamente, criando um canal de notificação conforme necessário para dispositivos com Android Oreo (API 26) ou superior.

### Solicitação de Permissão
- Verifica e solicita a permissão de envio de notificações no Android Tiramisu (API 33) ou superior, assegurando que o usuário tenha controle sobre as notificações recebidas.

### Envio de Notificações
- Dispara notificações push personalizadas com título e texto definidos pelo usuário.

## 🛠 Tecnologias Utilizadas
- **Kotlin:** Linguagem principal utilizada para o desenvolvimento do projeto.
- **Jetpack Compose:** Framework de UI moderno para criar layouts de forma declarativa.
- **NotificationCompat:** Para construir e emitir notificações compatíveis com várias versões do Android.
- **ActivityResultLauncher:** Gerenciamento de permissões de maneira segura e simplificada.

## 📱 Uso
O projeto inclui um botão na interface que, ao ser clicado, dispara uma notificação simulando um push, útil para fins de testes e demonstrações.

## 📝 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/andrei-schievelbein/NotificationPush.git
```
2. Abra o projeto no Android Studio.
3. Compile e execute em um dispositivo ou emulador Android compatível.
## 📷 Screenshots
<img src="./docs/demo.gif" alt="Demonstração do Projeto" width="300"/>

## 💡 *Contribuições*
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

### Feito por Andrei Schievelbein |[🌐LinkedIn](https://www.linkedin.com/in/andrei-schievelbein/)

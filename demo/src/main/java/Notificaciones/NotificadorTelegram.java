package Notificaciones;

public class NotificadorTelegram extends NotificadorDecorator {
    public NotificadorTelegram(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        enviarTelegram(mensaje);
    }

    private void enviarTelegram(String mensaje) {
        System.out.println("Enviando Telegram: " + mensaje);
    }
}
package Notificaciones;

public class NotificadorWhatsApp extends NotificadorDecorator {
    public NotificadorWhatsApp(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        enviarWhatsApp(mensaje);
    }

    private void enviarWhatsApp(String mensaje) {
        System.out.println("Enviando WhatsApp: " + mensaje);
    }
}
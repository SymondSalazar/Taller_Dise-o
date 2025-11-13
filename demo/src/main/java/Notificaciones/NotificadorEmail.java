package Notificaciones;

public class NotificadorEmail extends NotificadorDecorator {
    public NotificadorEmail(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        enviarEmail(mensaje);
    }

    private void enviarEmail(String mensaje) {
        System.out.println("Enviando Email: " + mensaje);
    }
}

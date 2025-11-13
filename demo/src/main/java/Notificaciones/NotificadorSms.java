package Notificaciones;

public class NotificadorSms extends NotificadorDecorator{
    public NotificadorSms(Notificador notificador){
        super(notificador);
    }

    @Override
    public void enviar(String mensaje){
        super.enviar(mensaje);
        enviarSms(mensaje);
    }

    private void enviarSms(String mensaje){
        System.out.println("Enviando sms: " + mensaje);
    }
}

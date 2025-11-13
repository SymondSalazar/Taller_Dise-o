package Notificaciones;

public abstract class NotificadorDecorator implements Notificador{
    protected Notificador envuelto;

    public NotificadorDecorator(Notificador notificador){
        this.envuelto = notificador;
    }

    public void enviar(String mensaje){
        envuelto.enviar(mensaje);
    }
}

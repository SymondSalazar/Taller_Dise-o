package Notificaciones;

public class NotificadorBase implements Notificador{
    public void enviar(String mensaje){
        System.out.println("Enviando un mensaje desde la base: " + mensaje);
    }
}

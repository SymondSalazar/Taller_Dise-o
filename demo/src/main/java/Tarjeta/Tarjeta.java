package Tarjeta;

public interface Tarjeta {
    String getTipo();
    String getBeneficios();

    default void usarTarjeta(){
        System.out.println("Tarjeta ha sido usada " + getBeneficios());
    }
}

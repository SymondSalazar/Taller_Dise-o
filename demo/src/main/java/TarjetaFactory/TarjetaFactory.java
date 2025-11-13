package TarjetaFactory;

import Tarjeta.Tarjeta;

public abstract class TarjetaFactory {
    public abstract Tarjeta crearTarjeta();

    public Tarjeta solicitarTarjeta(){
        Tarjeta tarjeta = crearTarjeta();
        System.out.println("Se creo la tarjeta " + tarjeta.getTipo());
        return tarjeta;
    }
}

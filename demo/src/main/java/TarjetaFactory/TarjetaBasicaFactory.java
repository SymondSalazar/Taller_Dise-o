package TarjetaFactory;

import Tarjeta.TarjetaBasica;
import Tarjeta.Tarjeta;

public class TarjetaBasicaFactory extends TarjetaFactory{
    @Override
    public Tarjeta crearTarjeta(){
        return new TarjetaBasica();
    }
}

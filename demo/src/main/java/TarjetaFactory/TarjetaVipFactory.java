package TarjetaFactory;

import Tarjeta.Tarjeta;
import Tarjeta.TarjetaVip;

public class TarjetaVipFactory extends TarjetaFactory{
    @Override
    public Tarjeta crearTarjeta(){
        return new TarjetaVip();
    }
}

package TarjetaFactory;

import Tarjeta.Tarjeta;
import Tarjeta.TarjetaPremium;

public class TarjetaPremiumFactory extends TarjetaFactory{
    @Override
    public Tarjeta crearTarjeta(){
        return new TarjetaPremium();
    }
}

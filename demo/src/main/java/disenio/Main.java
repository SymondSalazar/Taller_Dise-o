package disenio;

import TarjetaFactory.TarjetaVipFactory;
import Tarjeta.Tarjeta;
import TarjetaFactory.TarjetaFactory;
public class Main {
    public static void main(String[] args) {
        TarjetaFactory factoryVip = new TarjetaVipFactory();

        Tarjeta tarjetaVip = factoryVip.crearTarjeta();

        tarjetaVip.usarTarjeta();
    }
}
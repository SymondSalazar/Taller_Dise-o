package disenio;

import TarjetaFactory.TarjetaVipFactory;
import Canales.CanalMovil;
import Canales.CanalWeb;
import Canales.ICanalVirtual;
import Notificaciones.Notificador;
import Notificaciones.NotificadorBase;
import Notificaciones.NotificadorEmail;
import Notificaciones.NotificadorSms;
import Notificaciones.NotificadorWhatsApp;
import Sistemas.SistemaAntiguo;
import Sistemas.SistemaAntiguoAdapter;
import Tarjeta.Tarjeta;
import TarjetaFactory.TarjetaFactory;
public class Main {
    public static void main(String[] args) {

        // Ejemplo de ejecucion primera problematica
        System.out.println("--------------------------------");
        System.out.println("Aplicando el patron Factory");
        TarjetaFactory factoryVip = new TarjetaVipFactory();

        Tarjeta tarjetaVip = factoryVip.crearTarjeta();

        tarjetaVip.usarTarjeta();

        //Ejemplo de ejecucion segunda problematica
        System.out.println("--------------------------------");
        System.out.println("Aplicando el patron Adapter");
        SistemaAntiguo sistemaAntiguo = new SistemaAntiguo();
        ICanalVirtual adapter = new SistemaAntiguoAdapter(sistemaAntiguo);

    
        CanalWeb canalWeb = new CanalWeb(adapter);
        canalWeb.solicitarServicio();


        CanalMovil canalMovil = new CanalMovil(adapter);
        canalMovil.solicitarServicio();

                //Ejemplo de ejecucion segunda problematica
        System.out.println("--------------------------------");
        System.out.println("Aplicando el patron Decorator");
        Notificador notificador = new NotificadorWhatsApp(
                                    new NotificadorEmail(
                                      new NotificadorSms(
                                        new NotificadorBase()
                                      )));

        notificador.enviar("Ejemplo de mensaje");        
    }
}
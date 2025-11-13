package Canales;

import clasesDatosAuxiliares.DatosNuevos;
import clasesDatosAuxiliares.ResultadoNuevo;

public class CanalWeb {
    private ICanalVirtual canalAdapter;

    public CanalWeb(ICanalVirtual canalAdapter){
        this.canalAdapter = canalAdapter;
    }

    public void solicitarServicio(){
        DatosNuevos datosWeb = new DatosNuevos("Ejemplo de datos nuevos");  
        ResultadoNuevo resultado = canalAdapter.procesarSolicitud(datosWeb);
        System.out.println("Se solicito el servicio web: " + resultado.getDescripcion());
    }
}

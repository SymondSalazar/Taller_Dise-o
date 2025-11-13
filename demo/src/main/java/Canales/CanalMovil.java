package Canales;

import clasesDatosAuxiliares.DatosNuevos;
import clasesDatosAuxiliares.ResultadoNuevo;

public class CanalMovil {
    private ICanalVirtual canalAdapter;

    public CanalMovil(ICanalVirtual canalAdapter){
        this.canalAdapter = canalAdapter;
    }

    public void solicitarServicio(){
        DatosNuevos datosMovil = new DatosNuevos("datos desde el movil");
        ResultadoNuevo resultado = canalAdapter.procesarSolicitud(datosMovil);
        System.out.println("Solicitado desde el movil: " + resultado.getDescripcion());
    }
}

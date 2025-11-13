package Canales;

import clasesDatosAuxiliares.DatosNuevos;
import clasesDatosAuxiliares.ResultadoNuevo;

public interface ICanalVirtual {
    ResultadoNuevo procesarSolicitud (DatosNuevos datosNuevos);
}

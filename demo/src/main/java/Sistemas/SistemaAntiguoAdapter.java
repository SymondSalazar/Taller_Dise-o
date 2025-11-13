package Sistemas;

import Canales.ICanalVirtual;
import clasesDatosAuxiliares.DatosAntiguos;
import clasesDatosAuxiliares.DatosNuevos;
import clasesDatosAuxiliares.ResultadoAntiguo;
import clasesDatosAuxiliares.ResultadoNuevo;

public class SistemaAntiguoAdapter implements ICanalVirtual {
    private SistemaAntiguo sistemaAntiguo;
    
    public SistemaAntiguoAdapter(SistemaAntiguo sistemaAntiguo) {
        this.sistemaAntiguo = sistemaAntiguo;
    }

    @Override
    public ResultadoNuevo procesarSolicitud(DatosNuevos datosNuevos) {
        System.out.println("Traduciendo '" + datosNuevos.getDescripcion() + "' al formato antiguo...");
        DatosAntiguos datosAntiguos = traducirASistemaAntiguo(datosNuevos);

        ResultadoAntiguo resultadoAntiguo = sistemaAntiguo.realizarTransaccionPresencial(datosAntiguos);

        System.out.println("Traduciendo 'resultadoAntiguo' al formato nuevo...");
        return traducirAFormatoNuevo(resultadoAntiguo);
    }

    private DatosAntiguos traducirASistemaAntiguo(DatosNuevos datosNuevos) {
        return new DatosAntiguos("Traducido desde nuevos: " + datosNuevos.getDescripcion());
    }

    private ResultadoNuevo traducirAFormatoNuevo(ResultadoAntiguo resultadoAntiguo) {
        return new ResultadoNuevo("Adaptado al nuevo formato: " + resultadoAntiguo.getDescripcion());
    }
}
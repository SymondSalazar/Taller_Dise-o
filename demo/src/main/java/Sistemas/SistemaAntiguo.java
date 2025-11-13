package Sistemas;

import clasesDatosAuxiliares.DatosAntiguos;
import clasesDatosAuxiliares.ResultadoAntiguo;

public class SistemaAntiguo {
    public ResultadoAntiguo realizarTransaccionPresencial(DatosAntiguos datosAntiguos){
        System.out.println("Procesando transaccion con sistema antiguo: " +datosAntiguos.getDescripcion());
        return new ResultadoAntiguo("Resultado del sistema presencial. ");
    }
}

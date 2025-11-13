package Tarjeta;

public class TarjetaPremium implements Tarjeta {
    public String getTipo(){
        return "Tarjeta Premium";
    }

    public String getBeneficios(){
        return "Recibes mas beneficios que el basico";
    }
}

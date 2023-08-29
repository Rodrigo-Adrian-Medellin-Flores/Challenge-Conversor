package clasesUtilitarias;

import clasesAbstractas.Masa;
import clasesAbstractas.Unidades;

public class Libra extends Masa{

    public static double gramo() {
        return Unidades.cantidad * 453.592;
    }

    public static double kilogramo() {
        return Unidades.cantidad / 2.20462;
    }

    public static double tonelada() {
        return Unidades.cantidad / 2204.62;
    }

    public static double onza() {
        return Unidades.cantidad * 16;
    }

    public static double libra() {
        return Unidades.cantidad;
    }
    
}

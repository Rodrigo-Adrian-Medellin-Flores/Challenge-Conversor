package clasesUtilitarias;

import clasesAbstractas.Masa;
import clasesAbstractas.Unidades;

public class Kilogramo extends Masa {

    public static double gramo() {
        return Unidades.cantidad * 1000;
    }

    public static double kilogramo() {
        return Unidades.cantidad;
    }

    public static double tonelada() {
        return Unidades.cantidad / 1000;
    }

    public static double onza() {
        return Unidades.cantidad * 35.274;
    }

    public static double libra() {
        return Unidades.cantidad * 2.20462;
    }
    
}

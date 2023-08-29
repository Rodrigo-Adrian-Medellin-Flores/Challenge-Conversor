package clasesUtilitarias;

import clasesAbstractas.Masa;
import clasesAbstractas.Unidades;

public class Onza extends Masa {

    public static double gramo() {
        return Unidades.cantidad * 28.3495;
    }

    public static double kilogramo() {
        return Unidades.cantidad / 35.274;
    }

    public static double tonelada() {
        return Unidades.cantidad / 35274;
    }

    public static double onza() {
        return Unidades.cantidad;
    }

    public static double libra() {
        return Unidades.cantidad / 16;
    }
    
}

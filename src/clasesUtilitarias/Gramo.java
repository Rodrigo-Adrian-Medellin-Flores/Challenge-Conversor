package clasesUtilitarias;

import clasesAbstractas.Masa;
import clasesAbstractas.Unidades;

public class Gramo extends Masa {

    public static double gramo() {
        return Unidades.cantidad;
    }

    public static double kilogramo() {
        return Unidades.cantidad / 1000;
    }

    public static double tonelada() {
        return Unidades.cantidad / 1000000;
    }

    public static double onza() {
        return Unidades.cantidad / 28.349;
    }

    public static double libra() {
        return Unidades.cantidad / 453.592;
    }
    
}

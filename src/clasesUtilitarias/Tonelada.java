package clasesUtilitarias;

import clasesAbstractas.Masa;
import clasesAbstractas.Unidades;

public class Tonelada extends Masa {

    public static double gramo() {
        return Unidades.cantidad * 1000000;
    }

    public static double kilogramo() {
        return Unidades.cantidad * 1000;
    }

    public static double tonelada() {
        return Unidades.cantidad;
    }

    public static double onza() {
        return Unidades.cantidad * 35274;
    }

    public static double libra() {
        return Unidades.cantidad * 2204.62;
    }
}

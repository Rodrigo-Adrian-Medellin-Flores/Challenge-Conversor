package clasesUtilitarias;

import clasesAbstractas.Longitud;
import clasesAbstractas.Unidades;

public class Kilometro extends Longitud {

    public static double centimetro(){
        return Unidades.cantidad * 100000;
    }


    public static double metro(){
        return Unidades.cantidad * 1000;
    }


    public static double kilometro(){
        return Unidades.cantidad;
    }


    public static double pulgada(){
        return Unidades.cantidad * 39370;
    }


    public static double pie(){
        return Unidades.cantidad * 3280.83;
    }


    public static double yarda(){
        return Unidades.cantidad * 1093.60;
    }


    public static double milla(){
        return Unidades.cantidad / 1.60934;
    }
    
}

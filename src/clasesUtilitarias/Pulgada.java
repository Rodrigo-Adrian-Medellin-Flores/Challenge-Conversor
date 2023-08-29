package clasesUtilitarias;

import clasesAbstractas.Longitud;
import clasesAbstractas.Unidades;

public class Pulgada extends Longitud{

    public static double centimetro(){
        return Unidades.cantidad * 2.54;
    }


    public static double metro(){
        return Unidades.cantidad / 39.37;
    }


    public static double kilometro(){
        return Unidades.cantidad / 39370;
    }


    public static double pulgada(){
        return Unidades.cantidad;
    }


    public static double pie(){
        return Unidades.cantidad / 12;
    }


    public static double yarda(){
        return Unidades.cantidad / 36;
    }


    public static double milla(){
        return Unidades.cantidad / 63360;
    }
    
}

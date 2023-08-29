package clasesUtilitarias;

import clasesAbstractas.Longitud;
import clasesAbstractas.Unidades;

public class Milla extends Longitud {

    public static double centimetro(){
        return Unidades.cantidad * 160934;
    }


    public static double metro(){
        return Unidades.cantidad * 1609.34;
    }


    public static double kilometro(){
        return Unidades.cantidad * 1.60934;
    }


    public static double pulgada(){
        return Unidades.cantidad * 63360;
    }


    public static double pie(){
        return Unidades.cantidad * 5280;
    }


    public static double yarda(){
        return Unidades.cantidad * 1760;
    }


    public static double milla(){
        return Unidades.cantidad;
    }
    
}

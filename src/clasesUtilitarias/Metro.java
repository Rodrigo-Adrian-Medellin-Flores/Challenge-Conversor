package clasesUtilitarias;

import clasesAbstractas.Longitud;
import clasesAbstractas.Unidades;

public class Metro extends Longitud{

    public static double centimetro(){
        return Unidades.cantidad * 100;
    }


    public static double metro(){
        return Unidades.cantidad;
    }


    public static double kilometro(){
        return Unidades.cantidad / 1000;
    }


    public static double pulgada(){
        return Unidades.cantidad * 39.37;
    }


    public static double pie(){
        return Unidades.cantidad * 3.28083;
    }


    public static double yarda(){
        return Unidades.cantidad * 1.0936;
    }


    public static double milla(){
        return Unidades.cantidad / 1609.34;
    }
    
}

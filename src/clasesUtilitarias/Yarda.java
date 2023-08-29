package clasesUtilitarias;

import clasesAbstractas.Longitud;
import clasesAbstractas.Unidades;

public class Yarda extends Longitud {

    public static double centimetro(){
        return Unidades.cantidad * 91.44;
    }


    public static double metro(){
        return Unidades.cantidad / 1.0936;
    }


    public static double kilometro(){
        return Unidades.cantidad / 1093.6;
    }


    public static double pulgada(){
        return Unidades.cantidad * 36;
    }


    public static double pie(){
        return Unidades.cantidad * 3;
    }


    public static double yarda(){
        return Unidades.cantidad;
    }


    public static double milla(){
        return Unidades.cantidad / 1760;
    }
    
}

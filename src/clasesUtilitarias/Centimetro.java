package clasesUtilitarias;

import clasesAbstractas.Longitud;
import clasesAbstractas.Unidades;

public class Centimetro extends Longitud {

    public static double centimetro(){
        return Unidades.cantidad;
    }


    public static double metro(){
        return Unidades.cantidad / 100;
    }


    public static double kilometro(){
        return Unidades.cantidad / 100000;
    }


    public static double pulgada(){
        return Unidades.cantidad / 2.54;
    }


    public static double pie(){
        return Unidades.cantidad / 30.48;
    }


    public static double yarda(){
        return Unidades.cantidad / 91.44;
    }


    public static double milla(){
        return Unidades.cantidad / 160934;
    }

}

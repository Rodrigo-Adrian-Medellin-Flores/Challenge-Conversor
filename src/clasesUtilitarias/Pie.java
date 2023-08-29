package clasesUtilitarias;

import clasesAbstractas.Longitud;
import clasesAbstractas.Unidades;

public class Pie extends Longitud{

    public static double centimetro(){
        return Unidades.cantidad * 30.48;
    }


    public static double metro(){
        return Unidades.cantidad / 3.28083;
    }


    public static double kilometro(){
        return Unidades.cantidad / 3280.83;
    }


    public static double pulgada(){
        return Unidades.cantidad * 12;
    }


    public static double pie(){
        return Unidades.cantidad;
    }


    public static double yarda(){
        return Unidades.cantidad / 3;
    }


    public static double milla(){
        return Unidades.cantidad / 5280;
    }
    
}

package clasesUtilitarias;

import clasesAbstractas.Tiempo;
import clasesAbstractas.Unidades;

public class Dia extends Tiempo{

    public static double segundo(){
        return Unidades.cantidad * 86400;
    }

    public static double minuto(){
        return Unidades.cantidad * 1440;
    }

    public static double hora(){
        return Unidades.cantidad * 24;
    }

    public static double dia(){
        return Unidades.cantidad;
    }
        
}

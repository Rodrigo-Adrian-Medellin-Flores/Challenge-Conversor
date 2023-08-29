package clasesUtilitarias;

import clasesAbstractas.Tiempo;
import clasesAbstractas.Unidades;

public class Minuto extends Tiempo{

    public static double segundo(){
        return Unidades.cantidad * 60;
    }

    public static double minuto(){
        return Unidades.cantidad;
    }

    public static double hora(){
        return Unidades.cantidad / 60;
    }

    public static double dia(){
        return Unidades.cantidad / 1440;
    }
        
}

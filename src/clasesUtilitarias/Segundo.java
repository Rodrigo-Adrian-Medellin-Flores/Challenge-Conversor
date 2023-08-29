package clasesUtilitarias;

import clasesAbstractas.Tiempo;
import clasesAbstractas.Unidades;

public class Segundo extends Tiempo{

    public static double segundo(){
        return Unidades.cantidad;
    }

    public static double minuto(){
        return Unidades.cantidad / 60;
    }

    public static double hora(){
        return Unidades.cantidad / 3600;
    }

    public static double dia(){
        return Unidades.cantidad / 86400;
    }
    
}

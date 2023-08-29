package clasesUtilitarias;

import clasesAbstractas.Unidades;
import clasesAbstractas.Velocidad;

public class Milla_por_hora extends Velocidad{

    public static double metro_por_segundo(){
        return Unidades.cantidad / 2.23694;
    }

    public static double kilometro_por_hora(){
        return Unidades.cantidad * 1.60934;
    }

    public static double pie_por_segundo(){
        return Unidades.cantidad * 1.46667;
    }

    public static double milla_por_hora(){
        return Unidades.cantidad;
    }

    public static double nudo(){
        return Unidades.cantidad / 1.15078;
    }
        
}

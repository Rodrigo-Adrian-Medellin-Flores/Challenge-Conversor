package clasesUtilitarias;

import clasesAbstractas.Unidades;
import clasesAbstractas.Velocidad;

public class Kilometro_por_Hora extends Velocidad{

    public static double metro_por_segundo(){
        return Unidades.cantidad / 3.6;
    }

    public static double kilometro_por_hora(){
        return Unidades.cantidad;
    }

    public static double pie_por_segundo(){
        return Unidades.cantidad / 1.09728;
    }

    public static double milla_por_hora(){
        return Unidades.cantidad / 1.60934;
    }

    public static double nudo(){
        return Unidades.cantidad / 1.852;
    }
        
}

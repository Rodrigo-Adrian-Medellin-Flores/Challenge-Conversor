package clasesUtilitarias;

import clasesAbstractas.Unidades;
import clasesAbstractas.Velocidad;

public class Nudo extends Velocidad{

    public static double metro_por_segundo(){
        return Unidades.cantidad / 1.94385;
    }

    public static double kilometro_por_hora(){
        return Unidades.cantidad * 1.852;
    }

    public static double pie_por_segundo(){
        return Unidades.cantidad * 1.68781;
    }

    public static double milla_por_hora(){
        return Unidades.cantidad * 1.15078;
    }

    public static double nudo(){
        return Unidades.cantidad;
    }
        
}

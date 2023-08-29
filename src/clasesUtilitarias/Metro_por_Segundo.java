package clasesUtilitarias;

import clasesAbstractas.Unidades;
import clasesAbstractas.Velocidad;

public class Metro_por_Segundo extends Velocidad{

    public static double metro_por_segundo(){
        return Unidades.cantidad;
    }

    public static double kilometro_por_hora(){
        return Unidades.cantidad * 3.6;
    }

    public static double pie_por_segundo(){
        return Unidades.cantidad * 3.28084;
    }

    public static double milla_por_hora(){
        return Unidades.cantidad * 2.23694;
    }

    public static double nudo(){
        return Unidades.cantidad * 1.94385;
    }
    
}

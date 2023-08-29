package clasesUtilitarias;

import clasesAbstractas.Unidades;
import clasesAbstractas.Velocidad;

public class Pie_por_Segundo extends Velocidad{

    public static double metro_por_segundo(){
        return Unidades.cantidad / 3.28084;
    }

    public static double kilometro_por_hora(){
        return Unidades.cantidad * 1.09728;
    }

    public static double pie_por_segundo(){
        return Unidades.cantidad;
    }

    public static double milla_por_hora(){
        return Unidades.cantidad / 1.46667;
    }

    public static double nudo(){
        return Unidades.cantidad / 1.68781;
    }
        
}

package clasesAbstractas;

import clasesUtilitarias.*;

public abstract class Unidades {

    public static final Class<?>[] unidades = {Temperatura.class, Longitud.class, Masa.class, Tiempo.class, Velocidad.class, Divisas.class};
    public static final Class<?>[] subunidades = {Celsius.class, Fahrenheit.class, Kelvin.class, Centimetro.class, Metro.class, Kilometro.class, Pulgada.class, Pie.class, Yarda.class, Milla.class, Gramo.class, Kilogramo.class, Tonelada.class, Onza.class, Libra.class, Segundo.class, Minuto.class, Hora.class, Dia.class, Metro_por_Segundo.class, Kilometro_por_Hora.class, Pie_por_Segundo.class, Milla_por_hora.class, Nudo.class};

    public static double cantidad = 0;
    
}

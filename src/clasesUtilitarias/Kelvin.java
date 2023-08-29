package clasesUtilitarias;

import clasesAbstractas.Temperatura;
import clasesAbstractas.Unidades;

public class Kelvin extends Temperatura {

    public static double celsius(){
        return Unidades.cantidad - 273.15;
   }
   

   public static double fahrenheit(){
        return (Unidades.cantidad * 1.8) - 459.67;
   }
   

   public static double kelvin(){
        return Unidades.cantidad;
   }
    
}

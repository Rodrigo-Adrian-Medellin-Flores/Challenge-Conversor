package clasesUtilitarias;

import clasesAbstractas.Temperatura;
import clasesAbstractas.Unidades;

public class Fahrenheit extends Temperatura {

    public static double celsius(){
        return (Unidades.cantidad - 32) / 1.8;
   }
   

   public static double fahrenheit(){
        return Unidades.cantidad;
   }
   

   public static double kelvin(){
        return (Unidades.cantidad + 459.67)  / 1.8;
   }
    
}

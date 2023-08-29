package clasesUtilitarias;

import clasesAbstractas.Temperatura;
import clasesAbstractas.Unidades;

public class Celsius extends Temperatura{

   public static double celsius(){
        return Unidades.cantidad;
   }
   

   public static double fahrenheit(){
        return (Unidades.cantidad * 1.8) + 32;
   }
   

   public static double kelvin(){
        return Unidades.cantidad + 273.15;
   }
   
}

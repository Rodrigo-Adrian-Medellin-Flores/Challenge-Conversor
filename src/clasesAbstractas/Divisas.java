package clasesAbstractas;

import java.util.List;
import io.fixer.data.Currency;

public abstract class Divisas extends Unidades {

    private static final Currency currency = new Currency();
    public static List<Double> listaValores = currency.getValues();
    public static List<String> listaNombres = currency.getNames();
    public static String fecha = currency.getDate();
    
}

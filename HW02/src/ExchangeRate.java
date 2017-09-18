import javax.swing.JOptionPane;

@SuppressWarnings("ALL")
public class ExchangeRate {

    /**
     * Main method of the ExchangeRate class. Requires user to input a original price and an option for a menu to
     * calculate the price at a different exchange rate.
     * @param args Main args.
     */
    public static void main(String[] args) {

        double originalMonetaryUnits = Double.parseDouble(JOptionPane.showInputDialog("Precio del producto: "));
        String menuChoice = JOptionPane.showInputDialog("Convertir de (seleccione un numero):\n [1] Peso a Dólar\n [2] Dólar a Peso\n [3] Peso a Euro\n [4] Euro a Peso");

        JOptionPane.showMessageDialog(
                null,
                "El precio del producto en las unidades seleccionadas es: " + getEquivalentPrice(
                        menuChoice,
                        originalMonetaryUnits));
    }

    /**
     * USDMXN actual exchange-rate.
     */
    public static final double usdmxn = 17.71;

    /**
     * EURMXN actual exchange-rate.
     */
    public static final double eurmxn = 21.14;

    /**
     * Private method of ExchangeRate class. Given an option and a origial price, calculate its equivalent exchange rate.
     * @param option String dentoting the option selected form the user.
     * @param originalMonetaryUnits Double, the original monetary units.
     * @return new monetary units given the exchange rate selected by the user at option.
     */
    private static double getEquivalentPrice(String option, double originalMonetaryUnits) {
        if (option.equals("1")) {
            return originalMonetaryUnits / usdmxn;
        } else if (option.equals("2")) {
            return originalMonetaryUnits * usdmxn;
        } else if (option.equals("3")) {
            return originalMonetaryUnits / eurmxn;
        } else {
            return originalMonetaryUnits * eurmxn;
        }
    }
}


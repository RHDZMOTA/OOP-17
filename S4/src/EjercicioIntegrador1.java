import javax.swing.JOptionPane;

@SuppressWarnings("ALL")
public class EjercicioIntegrador1 {

    public static void main(String[] args){

        double price = 0;
        String result = "";

        do {
            String productPriceString = JOptionPane.showInputDialog("Product price: ");

            if (productPriceString == null)
                break;
            if(productPriceString.trim().length() == 0)
                continue;
            try {
                price = Double.parseDouble(productPriceString);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                result = "Invalid price format (not a number).";
                JOptionPane.showMessageDialog(null, result);
                continue;
            }
            if (price == 0 ) {
                result = "Price is zero, try again.";
                JOptionPane.showMessageDialog(null, result);
            }
        } while (price == 0);

        if (price != 0) {
            result = Double.toString(price * 1.16);
            JOptionPane.showMessageDialog(null, "Price with taxes: " + result);
        }

    }
}

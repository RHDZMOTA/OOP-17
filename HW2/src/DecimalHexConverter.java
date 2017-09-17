import javax.swing.JOptionPane;

@SuppressWarnings("ALL")
public class DecimalHexConverter {

    /**
     * Principal method of class DeciamlHexConverter. Requires the inddicidual components of ARGB color elements
     * and returns the hex-color.
     * @param args Main args.
     */
    public static void main(String[] args) {

        // Request user input
        int alpha = getUserInput("Alpha");
        int red = getUserInput("Red");
        int green = getUserInput("Green");
        int blue = getUserInput("Blue");

        // Get hex vals
        String alphaHex = decimalToHex(alpha, 2, "");
        String redHex = decimalToHex(red, 2, "");
        String greenHex = decimalToHex(green, 2, "");
        String blueHex = decimalToHex(blue, 2, "");

        JOptionPane.showMessageDialog(
                null,
                formatResult(alphaHex + redHex + greenHex + blueHex)
        );
    }

    /**
     * Private method of class DecimalHexConverter. Use this method to request user input.
     * @param reqName Variable to request.
     * @return
     */
    private static int getUserInput(String reqName) {
        return Integer.parseInt(JOptionPane.showInputDialog(reqName + " :"));
    }

    /**
     * Private method of class DecimalHexConverter. Format the result to eliminate the first 0s.
     * @param res Result as a string.
     * @return
     */
    private static String formatResult(String res) {
        boolean condition = true;
        int i = 0;
        while (condition) {
            i += 1;
            String subString = res.substring(i-1, i);
            condition = (i < res.length()) && subString.equals("0");
        }
        String formattedRes = res.substring(i-1, res.length());
        return (formattedRes.length() > 0) ? formattedRes : "0";
    }

    /**
     * Private method of class DecimalHexConverter. Hex Codes.
     * @return hexcodes.
     */
    private static String hexCodes() {return "0123456789ABCDEF";}

    /**
     * Private method of class DecimalHexConverter. Transform from decimal to hex econding.
     * @param decimal Reference decimal number.
     * @param hexLen Expeced hexadecimal lenght (in this case, 2).
     * @param hexString String to build upon, use "".
     * @return
     */
    private static String decimalToHex(int decimal, int hexLen, String hexString) {
        int position = decimal & 15;
        return (hexLen == 0) ?
                new StringBuilder(hexString).reverse().toString() :
                decimalToHex(
                        decimal >> 4,
                        hexLen - 1,
                        hexString + hexCodes().substring(position, position+1));
    }

}


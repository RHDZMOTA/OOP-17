import javax.swing.JOptionPane;
import java.util.Collections;

@SuppressWarnings("ALL")
public class HexDecimalConverter {

    /**
     * Main method of class HexDecimalConverter. Requests the user a color in hexdecimal format and returns each
     * element.
     * @param args Arguments for method.
     */
    public static void main(String[] args) {

        String inputColor = JOptionPane.showInputDialog("Introduzca color ARGB: ").toUpperCase();
        String color = fillMissingZeros(inputColor);

        String resp = "";
        for (int i=1; i < 5; i++) {
            String hexColor = color.substring(2*(i-1), 2*i);
            int decimal = hexToDecimal(hexColor);
            resp += ("\n %-10s" + String.format("%5s", decimal) + String.format("%5s]", "["+hexColor));
        }
        String finalResp = String.format(resp, "Alpha:", "Red:", "Green:", "Blue:");
        JOptionPane.showMessageDialog(null, finalResp);
    }

    /**
     * Private method of class HexDecimalConverter. Returns the
     * decimal representation of a given a string representing a hexadecimal value.
     * @param hexString A string representing a hexadecimal value.
     * @return An int corresponding to the decimal interpretation of the hexadecimal value.
     */
    private static int hexToDecimal(String hexString) {
        int decimal = 0;
        for (int val: hexToInt(hexString))
            decimal = (decimal << 4) | (val);
        return decimal;
    }

    /**
     * Private method of class HexDecimalConverter. Returns a list of ints for a given string representing a
     * hexadecimal input for each character. e.g. C5 will return 12, 5.
     * @param hexString A string representing a hexadecimal value.
     * @return A list of ints for where each element correspond to the decimal interpretation of the chars at the hexStr.
     */
    private static int[] hexToInt(String hexString) {
        return hexString.chars().map(x -> ((x < 58) ? (x - 48) : (x - 55))).toArray();
    }

    /**
     * Private method of class HexDecimalConverter. If given a hexadecimal representation of a color, it fills with 0s
     * the missing parts to facilitate the program logic.
     * @param colorString An hexadecimal representation of a color stored in a String.
     * @return The same hexadecimal representation but with 0s filling the string up to 8 chars.
     */
    private static String fillMissingZeros(String colorString) {
        int missingZeros = 8-colorString.length();
        String stringZeros = String.join("", Collections.nCopies(missingZeros, "0"));
        return (missingZeros > 0) ? (stringZeros + colorString) : colorString;
    }

}


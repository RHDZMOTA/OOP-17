import java.util.Collections;

public class Converter {

    public static void main(String[] args) {
        System.out.println(decimalToHex(165, 2, ""));
        System.out.println(hexToDecimal("9E"));
    }

    public static String hexCodes() {return "0123456789ABCDEF";}

    private String fillWithZeros(String hexValue) {
        int missingZeros = hexValue.length();
        String stringZeros = String.join("", Collections.nCopies(8-missingZeros, "0"));
        return (missingZeros > 0) ? (stringZeros + hexValue) : hexValue;
    }

    private static String decimalToHex(int decimal, int hexLen, String hexString) {
        int position = decimal & 15;
        return (hexLen == 0) ?
                new StringBuilder(hexString).reverse().toString() :
                decimalToHex(
                        decimal >> 4,
                        hexLen - 1,
                        hexString + hexCodes().substring(position, position+1));
    }

    private static int[] hexToInt(String hexString) {
        return hexString.chars().map(x -> ((x < 58) ? (x - 48) : (x - 55))).toArray();
    }

    private static int hexToDecimal(String hexString) {
        int decimal = 0;
        for (int val: hexToInt(hexString))
            decimal = (decimal << 4) | (val);
        return decimal;
    }


}

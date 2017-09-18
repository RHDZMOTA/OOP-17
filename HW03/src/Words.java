import javax.swing.*;
import java.util.Arrays;

@SuppressWarnings("ALL")
public class Words {

    /**
     * Main method of class Words. Requests the number of words and each individual words. It prints out
     * the words as an Array and generates a matrix of all words.
     * @param args String.
     */
    public static void main(String[] args) {
        int nWords = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas palabras vamos a capturar?"));
        char[][] charMatrix = new char[nWords][];
        for (int i=0; i < nWords; i++) {
            String word = JOptionPane.showInputDialog("Palabra " + (i + 1) + ": ");
            charMatrix[i] = new char[word.length()];
            for (int j=0; j < word.length(); j++) {
                charMatrix[i][j] = word.charAt(j);
            }
            System.out.println(Arrays.toString(charMatrix[i]));
        }
    }
}

import javax.swing.JOptionPane;
import java.util.Arrays;


@SuppressWarnings("ALL")
public class Calificaciones {

    static public void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Number of notes: "));

        float[] notes = new float[n];
        for (int i = 0; i < n; i++) {
            notes[i] = Float.parseFloat(JOptionPane.showInputDialog("Nota " + i + ": "));
        }


        Arrays.sort(notes);
        int medianIndex = (n % 2 == 0) ? (n-1)/2 : n/2;
        float median = notes[medianIndex];

        String answer = "The sorted array is: " + Arrays.toString(notes) + "\nMedian: " + median;
        System.out.println(answer);


    }

}

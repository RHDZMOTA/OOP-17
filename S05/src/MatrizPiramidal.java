import java.util.Arrays;

@SuppressWarnings("ALL")
public class MatrizPiramidal {
    public static void main(String[] args) {
        int randomNumber = (int) (2 + 18 * Math.random());
        System.out.println("Random number: " + randomNumber);
        for (int i=1; i < randomNumber+1; i++) {
            int[] temp = new int[i];
            Arrays.fill(temp, i);
            System.out.println(Arrays.toString(temp));
        }
    }
}

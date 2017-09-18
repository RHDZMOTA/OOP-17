import java.util.Arrays;

@SuppressWarnings("ALL")
public class Vectors {

    public static void main(String[] args) {

        int[] vector = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 5;
        int[] greatetThanX = Arrays.stream(vector).filter(z -> z > x).toArray();
        int[] oddElements = Arrays.stream(vector).filter(z -> z % 2 != 0).toArray();

        System.out.println("Elements greater than x: ");
        for (int i: greatetThanX) {
            System.out.println(i);
        }

        System.out.println("Odd Elements:");
        for (int i: oddElements) {
            System.out.println(i);
        }

    }

}


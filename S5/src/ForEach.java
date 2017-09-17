import java.util.Arrays;

public class ForEach
{

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int numero: numeros) {
            System.out.println(numero);
        }
        int index = Arrays.binarySearch(numeros, 4);

        // int[] arreglo = Arrays.copyOf(numeros);
    }

}

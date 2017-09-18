import java.util.Arrays;

@SuppressWarnings("ALL")
public class ArraysK {

    /**
     * Main mathod of class ArraysK. Given two arrays and an index k, returns true of the first k elements of
     * each array are the same.
     * @param args String.
     */
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 99, 100};
        int[] secondArray = {4, 99, 2, 1, 2, 99};
        int k = 5;

        int[] firstElems = Arrays.copyOfRange(firstArray, 0, k);
        int[] secondElems = Arrays.copyOfRange(secondArray, 0, k);
        Arrays.sort(firstElems);
        Arrays.sort(secondElems);
        boolean areTheyEqual = Arrays.equals(firstElems, secondElems);

        printResult(firstArray, secondArray, k, areTheyEqual);
    }

    /**
     * Print out the result in a nice format.
     * @param firstArray First array of ints.
     * @param secondArray Second array of ints.
     * @param k Index for first k-elements.
     * @param result Boolean representing if the first k-elements are the same.
     */
    public static void printResult(int[] firstArray, int[] secondArray, int k, boolean result) {
        System.out.println(
                "Results \n"
                        + " > First array: " + Arrays.toString(firstArray) + "\n"
                        + " > Second array: " + Arrays.toString(secondArray) + "\n"
                        + " > k-value: " + k + "\n"
                        + " > Are they equal? " + result
        );
    }
}


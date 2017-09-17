
@SuppressWarnings("ALL")
public class SumMatrix {

    public static void main(String[] args) {

        double[][] A = new double[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] B = new double[][] {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        double[][] C = new double[A.length][B[0].length];

        for (int i=0; i < A.length; i++) {
            for (int j=0; j < B[0].length; j++) {
                double sumElem = A[i][j] + B[i][j];
                C[i][j] = sumElem;
                System.out.println(sumElem);
            }
        }

    }
}

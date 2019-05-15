package symphonysolutions.matrix.utils;

import symphonysolutions.matrix.data.MatrixData;
import symphonysolutions.matrix.elements.Fraction;

public class FractionMatrixConvertion extends MatrixConvertion implements MatrixUtils {

    @Override
    public void convert(MatrixData data) {

    }

    // can be implemented for both cases in MatrixConvertion ??
    @Override
    public void makeTransposeMatrix(MatrixData data) {
        int length = data.getMatrixSize();
        Fraction[][] transpose = new Fraction[length][length];
        Fraction[][] original = (Fraction[][]) data.getOriginalMatrix();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                transpose[j][i] = original[i][j];
            }
        }
        data.setTransposeMatrix(transpose);
    }

    /**
     * Funtion taken from https://www.geeksforgeeks.org/check-whether-given-matrix-orthogonal-not/
     * to check if result is correct
     * @param data
     * @return boolean
     */
    @Override
    public boolean isOrthogonal(MatrixData data) {
       /* // Find transpose
        Decimal[][] trans = (Decimal[][]) data.getOriginalMatrix();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                trans[i][j] = a[j][i];

        // Find product of a[][]
        // and its transpose
        int[][] prod = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int sum = 0;
                for (int k = 0; k < n; k++) {
                    // Since we are multiplying
                    // transpose of itself. We use
                    sum = sum + (a[i][k] * a[j][k]);
                }

                prod[i][j] = sum;
            }
        }

        // Check if product is
        // identity matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && prod[i][j] != 0)
                    return false;
                if (i == j && prod[i][j] != 1)
                    return false;
            }
        }*/

        return true;
    }
}

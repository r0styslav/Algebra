package symphonysolutions.matrix.helper;

public class MatrixUtil<T> {
    /**
     * Funtion taken from https://www.geeksforgeeks.org/check-whether-given-matrix-orthogonal-not/
     * to check if result is correct
     * @param a
     * @param n
     * @return boolean
     */

    public static boolean isOrthogonal(int[][] a, int n) {
        // Find transpose
        int[][] trans = new int[n][n];
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
        }

        return true;
    }

    /**
     *
     * @param size
     */
    public <T> T[][] generateRandomMatrix(int size) {
        for (int i=0; i<size; i++) {

        }
        return null;
    }
}

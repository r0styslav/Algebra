package symphonysolutions.matrix.utils;

import com.sun.deploy.cache.DeployCacheJarAccessImpl;
import symphonysolutions.matrix.data.MatrixData;
import symphonysolutions.matrix.elements.Decimal;

public class DecimalMatrixConversion implements MatrixUtils<Decimal> {

    @Override
    public void makeTransposeMatrix(MatrixData<Decimal> data) {
        int length = data.getMatrixSize();
        Decimal[][] transpose = new Decimal[length][length];
        Decimal[][] original = data.getOriginalMatrix();
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
     *
     * @param data
     * @return boolean
     */
    @Override
    public boolean isOrthogonal(Decimal[][] data) {
        System.out.print("Checking if matrix is Orthogonal----------> ");
        int size = data.length;
        Decimal[][] origin = data;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int sum = 0;
                for (int k = 0; k < size; k++) {
                    sum = sum + (origin[i][k].getNumber() * origin[j][k].getNumber());
                }
                if (i == j && sum != 1) {
                    System.out.println("Matrix is not Orthogonal");
                    return false;
                }
                if (i != j && sum != 0) {
                    System.out.println("Matrix is not Orthogonal");
                    return false;
                }
            }
        }
        System.out.println("Matrix is Orthogonal");
        return true;
    }

}

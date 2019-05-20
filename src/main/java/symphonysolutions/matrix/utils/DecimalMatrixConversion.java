package symphonysolutions.matrix.utils;

import org.ejml.data.DMatrixRMaj;
import org.ejml.dense.row.MatrixFeatures_DDRM;
import symphonysolutions.matrix.data.MatrixData;
import symphonysolutions.matrix.elements.Decimal;
import symphonysolutions.matrix.elements.Fraction;

import java.util.Arrays;

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
        data.printTransposeMatrixMatrix();

    }

    /**
     * Funtion taken from https://www.geeksforgeeks.org/check-whether-given-matrix-orthogonal-not/
     * to check if result is correct
     *
     * @param matrix
     * @return boolean
     */
    @Override
    public boolean isOrthogonal(Decimal[][] matrix) {
        System.out.print("Checking if matrix is Orthogonal----------> ");
        Decimal[][] origin = Arrays.stream(matrix).toArray(Decimal[][]::new);
        int size = matrix.length;
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

    @Override
    public boolean isOrthogonalDense(Decimal[][] matrix) {
        System.out.print("Checking if matrix is Orthogonal (Dense)----------> ");
        DMatrixRMaj dMatrixRMaj = convertMatrixDataToDMatrix(matrix);
        if (MatrixFeatures_DDRM.isOrthogonal(dMatrixRMaj, 0.5)) {
            System.out.println("Matrix is Orthogonal!");
            return true;
        } else {
            System.out.println("Matrix is not orthogonal !");
            return false;
        }
    }

    private DMatrixRMaj convertMatrixDataToDMatrix(Decimal[][] data) {
        DMatrixRMaj matrix = new DMatrixRMaj(data.length, data.length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                matrix.set(i, j, data[i][j].getNumber());
            }
        }
        System.out.println("DMatrix :");
        matrix.print();
        return matrix;
    }

}

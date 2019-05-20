package symphonysolutions.matrix.utils;

import org.ejml.data.DMatrixRMaj;
import org.ejml.dense.row.MatrixFeatures_DDRM;
import symphonysolutions.matrix.data.MatrixData;
import symphonysolutions.matrix.elements.Fraction;

import java.util.Arrays;

public class FractionMatrixConvertion implements MatrixUtils<Fraction>  {
    // can be implemented for both cases in MatrixConvertion ??
    @Override
    public void makeTransposeMatrix(MatrixData<Fraction> data) {
        int length = data.getMatrixSize();
        Fraction[][] transpose = new Fraction[length][length];
        Fraction[][] original = data.getOriginalMatrix();
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
     * @param matrix
     * @return boolean
     */
    @Override
    public boolean isOrthogonal(Fraction[][] matrix) {
        System.out.print("Checking if matrix is Orthogonal----------> ");
        Fraction[][] origin = Arrays.stream(matrix).toArray(Fraction[][]::new);
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                double sum = 0;
                for (int k = 0; k < size; k++) {
                    sum = sum + (origin[i][k].getValue() * origin[j][k].getValue());
                }
                if (sum != 1 && i == j) {
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
    public boolean isOrthogonalDense(Fraction[][] matrix) {
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

    private DMatrixRMaj convertMatrixDataToDMatrix(Fraction[][] data) {
        DMatrixRMaj matrix = new DMatrixRMaj(data.length, data.length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                matrix.set(i, j, data[i][j].getValue());
            }
        }
        System.out.println("DMatrix :");
        matrix.print();
        return matrix;
    }


}

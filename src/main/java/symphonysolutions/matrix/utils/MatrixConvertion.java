package symphonysolutions.matrix.utils;

import org.ejml.data.DMatrixRMaj;
import org.ejml.dense.row.MatrixFeatures_DDRM;
import symphonysolutions.matrix.data.MatrixData;
import symphonysolutions.matrix.elements.Number;

public abstract class MatrixConvertion<T extends Number> {

    public boolean isOrthogonalDense(T[][] matrix) {
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


    public boolean isOrthogonal(T[][] matrix) {
        System.out.print("Checking if matrix is Orthogonal----------> ");

        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                double sum = 0;
                for (int k = 0; k < size; k++) {
                    sum = sum + (matrix[i][k].getValue() * matrix[j][k].getValue());
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


    public DMatrixRMaj convertMatrixDataToDMatrix(T[][] data) {
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

    public abstract void makeTransposeMatrix(MatrixData<T> data);


}

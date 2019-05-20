package symphonysolutions.matrix.utils;

import org.ejml.data.DMatrixRMaj;
import org.ejml.dense.row.MatrixFeatures_DDRM;
import symphonysolutions.matrix.data.MatrixData;
import symphonysolutions.matrix.elements.Number;

public abstract class MatrixConvertion<T extends Number> {

    public abstract void makeTransposeMatrix(MatrixData<T> data);

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

    public DMatrixRMaj convertMatrixDataToDMatrix(T[][] data) {
        DMatrixRMaj matrix = new DMatrixRMaj(data.length, data.length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                matrix.set(i, j, data[i][j].getValue());
            }
        }
        // for testing
        //System.out.println("DMatrix :");
        //matrix.print();
        return matrix;
    }

}

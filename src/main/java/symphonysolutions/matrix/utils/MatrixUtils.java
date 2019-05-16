package symphonysolutions.matrix.utils;

import symphonysolutions.matrix.data.MatrixData;

public interface MatrixUtils<T> {
    void makeTransposeMatrix(MatrixData<T> data);
    boolean isOrthogonal(T[][] data);

}

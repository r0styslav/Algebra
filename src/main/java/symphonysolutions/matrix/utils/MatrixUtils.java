package symphonysolutions.matrix.utils;

import symphonysolutions.matrix.data.MatrixData;

public interface MatrixUtils {
    void makeTransposeMatrix(MatrixData data);
    boolean isOrthogonal(MatrixData data);

}

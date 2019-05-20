package symphonysolutions.matrix.utils;

import symphonysolutions.matrix.data.MatrixData;
import symphonysolutions.matrix.elements.Fraction;

public interface MatrixUtils<T> {
    void makeTransposeMatrix(final MatrixData<T> data);
    boolean isOrthogonal(final T[][] data);
    boolean isOrthogonalDense(final T[][] data);


}

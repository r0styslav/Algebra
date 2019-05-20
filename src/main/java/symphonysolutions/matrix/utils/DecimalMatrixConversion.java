package symphonysolutions.matrix.utils;

import symphonysolutions.matrix.data.MatrixData;
import symphonysolutions.matrix.elements.Decimal;


public class DecimalMatrixConversion extends MatrixConvertion<Decimal> {

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
}

package symphonysolutions.matrix.utils;

import symphonysolutions.matrix.data.MatrixData;
import symphonysolutions.matrix.elements.Fraction;

public class FractionMatrixConversion extends MatrixConvertion<Fraction> {

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

}

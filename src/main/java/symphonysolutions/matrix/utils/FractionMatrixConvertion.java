package symphonysolutions.matrix.utils;

import symphonysolutions.matrix.data.MatrixData;
import symphonysolutions.matrix.elements.Decimal;
import symphonysolutions.matrix.elements.Fraction;

public class FractionMatrixConvertion extends MatrixConvertion implements MatrixUtils<Fraction>  {
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
    }

    /**
     * Funtion taken from https://www.geeksforgeeks.org/check-whether-given-matrix-orthogonal-not/
     * to check if result is correct
     * @param data
     * @return boolean
     */
    @Override
    public boolean isOrthogonal(Fraction[][] data) {
        int size = data.length;
        Fraction[][] origin = data;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                double sum = 0;
                for (int k = 0; k < size; k++) {
                    sum = sum + (origin[i][k].getValue() * origin[j][k].getValue());
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

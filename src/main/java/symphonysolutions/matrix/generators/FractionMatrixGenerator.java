package symphonysolutions.matrix.generators;

import org.ejml.data.DMatrixRMaj;
import org.ejml.dense.row.RandomMatrices_DDRM;
import symphonysolutions.matrix.elements.Decimal;
import symphonysolutions.matrix.elements.Fraction;
import symphonysolutions.matrix.data.MatrixData;
import symphonysolutions.matrix.utils.RandomNumberGenerator;

import java.util.Random;

public class FractionMatrixGenerator implements MatrixGenerator {
    private MatrixData<Fraction> matrixData = new MatrixData<>();
    private final int MAX = 10;
    private final int MIN = -10;

    @Override
    public void generateRandomMatrix(int size) {
        Fraction[][] fractionArray = new Fraction[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                fractionArray[i][j] = new Fraction(getRandomInteger(), getRandomInteger());
            }
        }
        matrixData.setOriginalMatrix(fractionArray);
        matrixData.print();

    }

    @Override
    public void generateOrthogonalMatrix(int size) {
        Fraction[][] fractionArray = new Fraction[size][size];
        DMatrixRMaj orthogonal = RandomMatrices_DDRM.orthogonal(size, size, new Random());
        orthogonal.print();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                fractionArray[i][j] = new Fraction(orthogonal.get(i, j));
            }
        }
        matrixData.setOrthogonalMatrix(fractionArray);
        matrixData.printOrthogonalMatrix();
    }

    @Override
    public MatrixData<Fraction> getMatrix() {
        return matrixData;
    }

    private int getRandomInteger() {
        do {
            int value = RandomNumberGenerator.generateInt(MIN, MAX);
            if (value!=0) return value;
        } while (true);
    }
}

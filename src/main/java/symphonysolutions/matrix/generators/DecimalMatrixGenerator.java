package symphonysolutions.matrix.generators;

import org.ejml.data.DMatrixRMaj;
import org.ejml.dense.row.RandomMatrices_DDRM;
import symphonysolutions.matrix.data.MatrixData;
import symphonysolutions.matrix.elements.Decimal;
import symphonysolutions.matrix.elements.Fraction;
import symphonysolutions.matrix.utils.RandomNumberGenerator;

import java.util.Random;

public class DecimalMatrixGenerator implements MatrixGenerator {
    private MatrixData<Decimal> matrixData = new MatrixData<>();
    private final int MAX = 1;
    private final int MIN = -1;


    @Override
    public void generateRandomMatrix(int size) {
        Decimal[][] decimalArray = new Decimal[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                decimalArray[i][j] = new Decimal(RandomNumberGenerator.generateInt(MIN, MAX));
            }
        }
        matrixData.setOriginalMatrix(decimalArray);
        matrixData.print();
    }


    @Override
    public void generateOrthogonalMatrix(int size) {
        // TODO: implement generating orthogonal matrix for -1, 0, 1 numbers
        matrixData.setOrthogonalMatrix(generateOrthogonalMatrixTest(size));
    }

    @Override
    public MatrixData<Decimal> getMatrix() {
        return matrixData;
    }


    // to test method isOrthogonal()
    private Decimal[][] generateOrthogonalMatrixTest(int size) {

        return new Decimal[][] {{new Decimal(1), new Decimal(0), new Decimal(0)},
                {new Decimal(0), new Decimal(1), new Decimal(0)},
                {new Decimal(0), new Decimal(0), new Decimal(1)}};
    }
}

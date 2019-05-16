package symphonysolutions.matrix.generators;

import symphonysolutions.matrix.data.MatrixData;
import symphonysolutions.matrix.elements.Decimal;
import symphonysolutions.matrix.utils.RandomNumberGenerator;

public class DecimalMatrixGenerator implements MatrixGenerator {
    private MatrixData<Decimal> matrixData = new MatrixData<>();
    private final int MAX = 1;
    private final int MIN = -1;


    @Override
    public MatrixData<Decimal> generateRandomMatrix(int size) {
        Decimal[][] decimalArray = new Decimal[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                decimalArray[i][j] = new Decimal(RandomNumberGenerator.generateInt(MIN, MAX));
            }
        }
        matrixData.setOriginalMatrix(decimalArray);
        return matrixData;
    }


    @Override
    public MatrixData<Decimal> generateOrthogonalMatrix(int size) {
        Decimal[][] decimalArray = new Decimal[size][size];
        matrixData.setOrthogonalMatrix(decimalArray);
        return matrixData;
    }

    // to test method isOrthogonal()
    private Decimal[][] generateOrthogonalMatrixTest() {
        return new Decimal[][] {{new Decimal(1), new Decimal(0), new Decimal(0)},
                {new Decimal(0), new Decimal(1), new Decimal(0)},
                {new Decimal(0), new Decimal(0), new Decimal(1)}};
    }
}

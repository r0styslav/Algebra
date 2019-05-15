package symphonysolutions.matrix.generators;

import symphonysolutions.matrix.elements.Decimal;
import symphonysolutions.matrix.data.MatrixData;
import java.util.Random;

public class DecimalMatrixGenerator implements MatrixGenerator {
    private final int BOUNDARY = 2;

    @Override
    public MatrixData generateRandomMatrix(int size) {
        Decimal[][] decimalArray = new Decimal[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                decimalArray[i][j] = new Decimal(new Random().nextInt(BOUNDARY));
            }
        }
/*        Decimal[][] decimalArray = {{new Decimal(1), new Decimal(0), new Decimal(0)},
                {new Decimal(0), new Decimal(1), new Decimal(0)},
                {new Decimal(0), new Decimal(0), new Decimal(1)}};*/
        return new MatrixData<>(decimalArray);
    }
}

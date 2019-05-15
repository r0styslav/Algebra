package symphonysolutions.matrix.generators;

import symphonysolutions.matrix.elements.Fraction;
import symphonysolutions.matrix.data.MatrixData;

import java.util.Random;

public class FractionMatrixGenerator implements MatrixGenerator {
    private final int BOUNDARY = 100;

    @Override
    public MatrixData generateRandomMatrix(int size) {
        Fraction[][] fractionArray = new Fraction[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                fractionArray[i][j] = new Fraction(getRandomInteger(), getRandomInteger());
            }
        }
        return new MatrixData<>(fractionArray);
    }

    private int getRandomInteger() {
        do {
            int value = new Random().nextInt(BOUNDARY);
            if (value!=0) return value;
        } while (true);
    }
}

package symphonysolutions.matrix.generators;

import org.ejml.data.DMatrixRMaj;
import org.ejml.dense.row.MatrixFeatures_DDRM;
import org.ejml.dense.row.RandomMatrices_DDRM;
import symphonysolutions.matrix.elements.Fraction;
import symphonysolutions.matrix.data.MatrixData;

import java.util.Random;

public class FractionMatrixGenerator implements MatrixGenerator {
    private MatrixData<Fraction> matrixData = new MatrixData<>();
    private final int MAX = 100;
    private final int MIN = -100;
    private int SIZE;

    public FractionMatrixGenerator(int size) {
        SIZE = size;
    }

    public void generateRandomMatrix(int size) {
        Fraction[][] fractionArray = new Fraction[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                //fractionArray[i][j] = new Fraction(getRandomInteger(), getRandomInteger());
                fractionArray[i][j] = new Fraction(RandomNumberGenerator.generateDouble());
            }
        }
        matrixData.setOriginalMatrix(fractionArray);
        matrixData.print();
    }

    @Override
    public void generateRandomMatrix() {
        generateRandomMatrix(SIZE);
    }

    public void generateOrthogonalMatrix(int size) {
        System.out.println("Generating Orthogonal Matrix");
        Fraction[][] fractionArray = new Fraction[size][size];
        DMatrixRMaj orthogonal = RandomMatrices_DDRM.orthogonal(size, size, new Random());
        MatrixFeatures_DDRM.isOrthogonal(orthogonal, 0.5);
        //orthogonal.print();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                fractionArray[i][j] = new Fraction(orthogonal.get(i, j));
            }
        }
        matrixData.setOrthogonalMatrix(fractionArray);
        matrixData.printOrthogonalMatrix();
    }

    @Override
    public void generateOrthogonalMatrix() {
        generateOrthogonalMatrix(SIZE);
    }

    @Override
    public MatrixData<Fraction> getMatrix() {
        if (matrixData == null) {
            generateRandomMatrix();
        }
        return matrixData;
    }

}

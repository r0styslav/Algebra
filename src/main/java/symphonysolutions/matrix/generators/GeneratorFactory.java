package symphonysolutions.matrix.generators;

import symphonysolutions.matrix.utils.DecimalMatrixConvertion;
import symphonysolutions.matrix.utils.FractionMatrixConvertion;
import symphonysolutions.matrix.utils.MatrixConvertion;


public class GeneratorFactory {
    private MatrixGenerator generator;
    private MatrixConvertion convertion;
    //private MatrixData<?> matrix;

    public GeneratorFactory(String type) {
        if (type.toLowerCase().equals("d")) {
            generator = new DecimalMatrixGenerator();
            convertion = new DecimalMatrixConvertion();
            //matrix = new MatrixData<Decimal>();
        } else if (type.toLowerCase().equals("f")) {
            generator = new FractionMatrixGenerator();
            convertion = new FractionMatrixConvertion();
            //matrix = new MatrixData<Fraction>();
        } else
            System.out.println("Incorrect matrix type -> D / F");

    }

    public MatrixGenerator getMatrixGenerator() {
        return generator;
    }

    public MatrixConvertion getMatrixConvertion() {
        return convertion;
    }

/*    public MatrixData<T> getMatrixData() {
        return matrix;
    }*/
}

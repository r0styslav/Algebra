package symphonysolutions.matrix.generators;

import symphonysolutions.matrix.utils.DecimalMatrixConversion;
import symphonysolutions.matrix.utils.FractionMatrixConversion;
import symphonysolutions.matrix.utils.MatrixConvertion;


public class GeneratorFactory {
    private MatrixGenerator generator;
    private MatrixConvertion convertion;
    private static final int DEFAULT_SIZE = 5;

    public GeneratorFactory(String type) {
        this(type, DEFAULT_SIZE);
    }

    public GeneratorFactory(String type, int size) {
        if (type.toLowerCase().equals("d")) {
            generator = new DecimalMatrixGenerator(size);
            convertion = new DecimalMatrixConversion();
            //matrix = new MatrixData<Decimal>();
        } else if (type.toLowerCase().equals("f")) {
            generator = new FractionMatrixGenerator(size);
            convertion = new FractionMatrixConversion();
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

}

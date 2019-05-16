package symphonysolutions.matrix.generators;

import symphonysolutions.matrix.utils.DecimalMatrixConversion;
import symphonysolutions.matrix.utils.FractionMatrixConvertion;
import symphonysolutions.matrix.utils.MatrixConvertion;
import symphonysolutions.matrix.utils.MatrixUtils;


public class GeneratorFactory {
    private MatrixGenerator generator;
    private MatrixUtils convertion;

    public GeneratorFactory(String type) {
        if (type.toLowerCase().equals("d")) {
            generator = new DecimalMatrixGenerator();
            convertion = new DecimalMatrixConversion();
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

    public MatrixUtils getMatrixConvertion() {
        return convertion;
    }

}

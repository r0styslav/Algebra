package symphonysolutions.matrix.generators;

import symphonysolutions.matrix.utils.DecimalMatrixConvertion;
import symphonysolutions.matrix.utils.FractionMatrixConvertion;
import symphonysolutions.matrix.utils.MatrixConvertion;

public class GeneratorFactory {
    private MatrixGenerator generator;
    private MatrixConvertion convertion;

    public GeneratorFactory(String type) {
        if (type.toLowerCase().equals("d")) {
            generator = new DecimalMatrixGenerator();
            convertion = new DecimalMatrixConvertion();
        } else if (type.toLowerCase().equals("f")) {
            generator = new FractionMatrixGenerator();
            convertion = new FractionMatrixConvertion();
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

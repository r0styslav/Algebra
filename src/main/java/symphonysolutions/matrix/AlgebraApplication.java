package symphonysolutions.matrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import symphonysolutions.matrix.data.MatrixData;
import symphonysolutions.matrix.elements.Decimal;
import symphonysolutions.matrix.generators.GeneratorFactory;
import symphonysolutions.matrix.generators.MatrixGenerator;
import symphonysolutions.matrix.utils.MatrixConvertion;
import symphonysolutions.matrix.utils.MatrixUtils;

@SpringBootApplication
public class AlgebraApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlgebraApplication.class, args);
        int size = Integer.parseInt(args[0]);
        String matrixType = args[1];

        GeneratorFactory generatorFactory = new GeneratorFactory(matrixType);
        MatrixGenerator generator = generatorFactory.getMatrixGenerator();
        MatrixUtils matrixUtils = generatorFactory.getMatrixConvertion();
        generator.generateRandomMatrix(size);
        matrixUtils.isOrthogonal(generator.getMatrix().getOriginalMatrix());
        generator.generateOrthogonalMatrix(size);
        //matrixUtils.isOrthogonal(generator.getMatrix().getOrthogonalMatrix());

    }

}

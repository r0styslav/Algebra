package symphonysolutions.matrix.generators;

import symphonysolutions.matrix.data.MatrixData;
import symphonysolutions.matrix.elements.Number;

public interface MatrixGenerator<T extends Number> {

    void generateRandomMatrix();

    void generateOrthogonalMatrix();

    MatrixData<T> getMatrix();

}

package symphonysolutions.matrix.generators;

import symphonysolutions.matrix.data.MatrixData;

public interface MatrixGenerator<T> {

    void generateRandomMatrix();
    void generateOrthogonalMatrix();

    MatrixData<T> getMatrix();

}

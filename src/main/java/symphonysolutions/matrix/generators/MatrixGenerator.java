package symphonysolutions.matrix.generators;

import symphonysolutions.matrix.data.MatrixData;

public interface MatrixGenerator<T> {

    void generateRandomMatrix(int size);
    void generateOrthogonalMatrix(int size);

    MatrixData<T> getMatrix();

}

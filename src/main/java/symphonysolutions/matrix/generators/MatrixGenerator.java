package symphonysolutions.matrix.generators;

import symphonysolutions.matrix.data.MatrixData;

public interface MatrixGenerator<T> {

     MatrixData<T> generateRandomMatrix(int size);

     MatrixData<T> generateOrthogonalMatrix(int size);

}

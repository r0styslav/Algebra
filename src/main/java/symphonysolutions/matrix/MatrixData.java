package symphonysolutions.matrix;

public class MatrixData<T> {
    private T[][] matrix;

    public MatrixData(T[][] generatedRandomMatrix) {
        matrix = generatedRandomMatrix;
    }

    public T[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(T[][] matrix) {
        this.matrix = matrix;
    }
}

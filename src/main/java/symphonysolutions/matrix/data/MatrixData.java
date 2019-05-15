package symphonysolutions.matrix.data;

public class MatrixData<T> {
    private int matrixSize; // matrix is square only
    private T[][] originalMatrix;
    private T[][] orthogonalMatrix;
    private T[][] transposeMatrix;

    public MatrixData(T[][] generatedRandomMatrix) {
        originalMatrix = generatedRandomMatrix;
        matrixSize = generatedRandomMatrix.length;
    }

    public MatrixData() {
    }

    public T[][] getOriginalMatrix() {
        return originalMatrix;
    }

    public int getMatrixSize() {
        return matrixSize;
    }
    /*    public void setOriginalMatrix(T[][] originalMatrix) {
        this.originalMatrix = originalMatrix;
    }*/

    public void setOrthogonalMatrix(T[][] orthogonalMatrix) {
        this.orthogonalMatrix = orthogonalMatrix;
    }

    public void setTransposeMatrix(T[][] transposeMatrix) {
        this.transposeMatrix = transposeMatrix;
    }

    public T[][] getTransposeMatrix() {
        return transposeMatrix;
    }

    public void print(T[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" | " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    public void print() {
        System.out.println("Original matrix:");
        print(originalMatrix);
    }

    public void printOrthogonalMatrix() {
        System.out.println("Orthogonal matrix:");
        print(orthogonalMatrix);
    }

    public void printTransposeMatrixMatrix() {
        System.out.println("Transpose matrix:");
        print(transposeMatrix);
    }
}

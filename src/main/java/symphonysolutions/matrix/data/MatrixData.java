package symphonysolutions.matrix.data;

import symphonysolutions.matrix.elements.Number;

public class MatrixData<T extends Number> {
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

    public T[][] getOrthogonalMatrix() {
        return orthogonalMatrix;
    }

    public T[][] getOriginalMatrix() {
        return originalMatrix;
    }

    public int getMatrixSize() {
        return originalMatrix.length;
    }

    public void setOriginalMatrix(T[][] originalMatrix) {
        this.originalMatrix = originalMatrix;
    }

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
                System.out.printf("|%10.6s",matrix[i][j]);
            }
            System.out.println("|");
        }
    }

    public void print() {
        System.out.println("Original Random matrix:");
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

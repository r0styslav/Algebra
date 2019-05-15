package symphonysolutions.matrix;

public class FractionMatrix {
    private Fraction[][] matrix;

    public FractionMatrix(Fraction[][] generatedRandomMatrix) {
        matrix = generatedRandomMatrix;
    }

    public Fraction[][] getMatrix() {
        return matrix;
    }
}

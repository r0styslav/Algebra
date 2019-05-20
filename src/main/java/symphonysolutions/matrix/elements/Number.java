package symphonysolutions.matrix.elements;

public abstract class Number {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public abstract double getValue();

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}

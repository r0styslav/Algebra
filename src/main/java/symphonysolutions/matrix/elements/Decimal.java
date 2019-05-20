package symphonysolutions.matrix.elements;

public class Decimal extends Number {
    private int number;

    public Decimal(int decimal) {
        number = decimal;
    }

    public double getValue() {
        return number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}


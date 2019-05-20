package symphonysolutions.matrix.elements;

public class Decimal extends Number {
    private int number;

    public Decimal(int decimal) {
        super(decimal);
        number = decimal;
    }

    public double getValue() {
        return number;
    }
}


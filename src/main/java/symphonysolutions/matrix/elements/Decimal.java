package symphonysolutions.matrix.elements;

public class Decimal {
    private int number;

    public Decimal(int decimal) {
        number = decimal;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}


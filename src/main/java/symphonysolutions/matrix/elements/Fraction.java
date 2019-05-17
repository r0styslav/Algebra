package symphonysolutions.matrix.elements;

public class Fraction extends Number {
    private int numerator, denominator;
    private double value;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        value = (double) numerator/denominator;
    }

    public Fraction(double value) {
        this.value = value;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double getValue() {
        return value;
    }

    @Override
    /*public String toString() {
        return String.valueOf(numerator + "/" + denominator);
    }*/
    public String toString() {
        return String.valueOf(value);
    }

}

package Q1;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) throws NullDenominatorException {
        if (denominator == 0) {
            throw new NullDenominatorException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    // Driver class for testing
    public static void Q1() {
        try {
            Fraction fraction = new Fraction(1, 2);
            System.out.println(fraction);
            Fraction invalidFraction = new Fraction(1, 0);
        } catch (NullDenominatorException e) {
            System.out.println(e.getMessage());
        }
    }
}
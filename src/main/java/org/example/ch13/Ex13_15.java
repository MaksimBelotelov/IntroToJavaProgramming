package org.example.ch13;

/*
(Use BigInteger for the Rational class) Redesign and implement the Rational
class in Listing 13.13 using BigInteger for the numerator and denominator.
Write a test program that prompts the user to enter two rational numbers and
display the results.
 */

import java.math.BigInteger;

public class Ex13_15 {
    public static void main(String[] args) {

        Rational13_15 n1 = new Rational13_15(new BigInteger("3"), new BigInteger("454"));
        Rational13_15 n2 = new Rational13_15(new BigInteger("7"), new BigInteger("2389"));

        System.out.println(n1 + " + " + n2 + " = " + n1.add(n2));
        System.out.println(n1 + " - " + n2 + " = " + n1.subtract(n2));
        System.out.println(n1 + " * " + n2 + " = " + n1.multiply(n2));
        System.out.println(n1 + " / " + n2 + " = " + n1.divide(n2));
    }
}

class Rational13_15 extends Number
        implements Comparable<Rational13_15> {

    private BigInteger numerator = BigInteger.ZERO;
    private BigInteger denominator = BigInteger.ONE;

    public Rational13_15() {}

    public Rational13_15(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator, denominator);
        this.numerator = ((denominator.signum() > 0) ? BigInteger.ONE : new BigInteger("-1"))
                .multiply(numerator.divide(gcd));
        this.denominator = denominator.abs().divide(gcd);
    }

    private static BigInteger gcd(BigInteger n, BigInteger d) {
        BigInteger n1 = n.abs();
        BigInteger n2 = n.abs();
        BigInteger gcd = BigInteger.ONE;

        for (BigInteger k = BigInteger.ONE;
             k.compareTo(n1) >= 0 && k.compareTo(n2) >= 0;
             k = k.add(BigInteger.ONE)) {

            if (n1.remainder(k).equals(BigInteger.ZERO) &&
                    n2.remainder(k).equals(BigInteger.ZERO)) {
                gcd = k;
            }
        }

        return gcd;
    }

    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    public Rational13_15 add(Rational13_15 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator()).
                add(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());

        return new Rational13_15(n, d);
    }

    public Rational13_15 subtract(Rational13_15 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator())
                .subtract(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());

        return new Rational13_15(n, d);
    }

    public Rational13_15 multiply(Rational13_15 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());

        return new Rational13_15(n, d);
    }

    public Rational13_15 divide(Rational13_15 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator());
        BigInteger d = denominator.multiply(secondRational.getNumerator());

        return new Rational13_15(n, d);
    }

    @Override
    public String toString() {
        if (denominator.equals(BigInteger.ONE))
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object other) {
        return (this.subtract((Rational13_15) (other))).getNumerator().equals(BigInteger.ZERO);
    }

    @Override
    public int intValue() {
        return (int)doubleValue();
    }

    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator.divide(denominator).doubleValue();
    }

    @Override
    public long longValue() {
        return (long)doubleValue();
    }

    @Override
    public int compareTo(Rational13_15 o) {
        return (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO));
    }
}

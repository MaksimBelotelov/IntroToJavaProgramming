package org.example.ch13;

/*
(Use the Rational class) Write a program that computes the following summa-
tion series using the Rational class:

1/2 + 2/3 + 3/4 + ... + 98/99 + 99/100

 */

import java.math.BigInteger;

public class Ex13_18 {
    public static void main(String[] args) {
        Rational13_15 result =
                new Rational13_15(new BigInteger("1"), new BigInteger("2"));
        for (int i = 2; i <= 3; i++) {
            result = result.add(new Rational13_15(BigInteger.valueOf(i),
                    BigInteger.valueOf(i + 1)));
        }

        System.out.println(result.doubleValue());
    }
}

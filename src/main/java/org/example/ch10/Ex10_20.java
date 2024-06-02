package org.example.ch10;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
(Approximate e) Programming Exercise 5.26 approximates e using the ­following
series:

e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + ... + 1/i!

In order to get better precision, use BigDecimal with 25 digits of precision
in the computation. Write a program that displays the e value for i = 100 ,
200, . . . , and 1000.
 */
public class Ex10_20 {
    public static void main(String[] args) {
        BigDecimal e = new BigDecimal("1");
        BigDecimal addendum = new BigDecimal("1");

        for (int i = 1; i <= 1000; i++) {
            addendum = addendum.divide(new BigDecimal(i + ""), 25, RoundingMode.UP);
            e = e.add(addendum);

            if (i % 100 == 0)
                System.out.println(e);
        }
    }
}

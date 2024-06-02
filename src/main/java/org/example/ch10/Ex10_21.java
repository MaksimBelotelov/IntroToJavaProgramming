package org.example.ch10;

import java.math.BigInteger;

/*
(Divisible by 5 or 6) Find the first 10 numbers greater than Long.MAX_VALUE
that are divisible by 5 or 6.
 */
public class Ex10_21 {
    public static void main(String[] args) {
        BigInteger current = BigInteger.valueOf(Long.MAX_VALUE);
        current = current.add(BigInteger.ONE);
        BigInteger five = new BigInteger("5");
        BigInteger six = new BigInteger("6");
        int counter = 0;

        while(counter < 10) {
            if (current.remainder(five).equals(BigInteger.ZERO) ||
                current.remainder(six).equals(BigInteger.ZERO)) {
                System.out.println(current);
                counter++;
            }
            current = current.add(BigInteger.ONE);
        }
    }
}

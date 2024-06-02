package org.example.ch10;

import java.math.BigInteger;

/*
(Divisible by 2 or 3) Find the first 10 numbers with 50 decimal digits that are
divisible by 2 or 3.
 */
public class Ex10_16 {
    public static void main(String[] args) {
        int counter = 0;
        BigInteger bigInteger = new BigInteger("10000000000000000000000000000000000000000000000000");

        while (counter < 10) {
            if (bigInteger.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
                bigInteger.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {
                System.out.println(bigInteger);
                counter++;
            }
            bigInteger = bigInteger.add(BigInteger.ONE);
        }
    }
}

package org.example.ch10;

/*
(Square numbers) Find the first 10 square numbers that are greater than Long.
MAX_VALUE. A square number is a number in the form of n2. For example, 4, 9,
and 16 are square numbers. Find an efficient approach to run your program fast.
 */

import java.math.BigInteger;

public class Ex10_17 {
    public static void main(String[] args) {
        int counter = 0;
        long minimum = (long)Math.sqrt(Long.MAX_VALUE);
        BigInteger current = BigInteger.valueOf(minimum).add(BigInteger.ONE);

        while (counter < 10) {
            BigInteger sqr = current.pow(2);
            System.out.println(current + " " + sqr);
            current = current.add(BigInteger.ONE);
            counter++;
        }
    }
}

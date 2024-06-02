package org.example.ch10;

import java.math.BigInteger;

/*
(Large prime numbers) Write a program that finds five prime numbers larger
than Long.MAX_VALUE.
 */
public class Ex10_18 {
    public static void main(String[] args) {
        BigInteger bigInteger = BigInteger.valueOf(Long.MAX_VALUE);
        int counter = 0;
        BigInteger current = bigInteger.add(BigInteger.TWO);

        while (counter < 5) {
            BigInteger end = current.sqrt();
            boolean isPrime = true;
            for (BigInteger i = BigInteger.TWO; i.compareTo(end) < 0; i = i.add(BigInteger.ONE)) {
                if (current.remainder(i).equals(BigInteger.ZERO)) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(current);
                counter++;
            }
            current = current.add(BigInteger.TWO);
        }
    }
}


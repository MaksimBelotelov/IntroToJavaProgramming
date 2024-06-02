package org.example.ch10;

import java.math.BigInteger;

/*
(Mersenne prime) A prime number is called a Mersenne prime if it can be
written in the form 2p - 1 for some positive integer p. Write a program that
finds all Mersenne primes with p ... 100 and displays the output as shown
below. (Hint: You have to use BigInteger to store the number because it is
too big to be stored in long. Your program may take several hours to run.)
 */

public class Ex10_19 {
    public static void main(String[] args) {
        BigInteger current = new BigInteger("2");

        System.out.println("   p          2^p - 1  ");
        System.out.println("-----------------------");

        for (int p = 2; p <= 100; p++) {
            current = (current.multiply(BigInteger.TWO));
            BigInteger res = current.subtract(BigInteger.ONE);
            if (isPrime(res))
                System.out.println("   " + p + "        " + res);
        }
    }

    public static boolean isPrime(BigInteger n) {
        if (n.compareTo(BigInteger.ONE) == 0 || n.compareTo(BigInteger.TWO) == 0)
            return true;

        BigInteger end = n.sqrt();

        for (BigInteger div = new BigInteger("2"); div.compareTo(end) <= 0; div = div.add(BigInteger.ONE))
            if (n.remainder(div).equals(BigInteger.ZERO))
                return false;

        return true;
    }
}

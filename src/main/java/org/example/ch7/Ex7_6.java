package org.example.ch7;

/*
(Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a num-
ber n is prime by checking whether 2, 3, 4, 5, 6, . . . , n/2 is a divisor. If a divisor
is found, n is not prime. A more efficient approach is to check whether any of the
prime Rewrite numbers Listing less 5.15 than to display or equal the to first 2n 50 can prime divide numbers n evenly. using If not, this n approach.
is prime.
You need to use an array to store the prime numbers, and later use them to check
whether they are possible divisors for n.
 */

import java.util.Arrays;

public class Ex7_6 {
    public static void main(String[] args) {
        int[] primes = new int[50];
        primes[0] = 2;
        int counter = 1;
        for (int i = 3; counter < 50; i++) {
            boolean isPrime = true;
            for (int j = 0; primes[j] <= Math.pow(i, 0.5); j++) {
                if (i % primes[j] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primes[counter++] = i;
        }
        System.out.println(Arrays.toString(primes));
    }
}

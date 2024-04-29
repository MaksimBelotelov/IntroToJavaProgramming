package org.example.ch5;

/*
(Display prime numbers between 2 and 1,000) Modify the program given in Listing
5.15 to display all the prime numbers between 2 and 1,000, inclusive. Display eight
prime numbers per line. Numbers are separated by exactly one space.
 */

public class Ex5_20 {
    public static void main(String[] args) {
        int counter = 0;
        final int NUMBER_OF_PRIMES_PER_LINE = 8;

        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            for (int d = 2; d <= i / 2; d++) {
                if (i % d == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + ((counter % NUMBER_OF_PRIMES_PER_LINE == 0) ? "\n" : " "));
                counter++;
            }
        }
    }
}
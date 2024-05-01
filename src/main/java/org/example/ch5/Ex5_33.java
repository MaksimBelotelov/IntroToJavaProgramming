package org.example.ch5;
/*
(Perfect number) A positive integer is called a perfect number if it is equal to the sum
of all of its positive divisors, excluding itself. For example, 6 is the first perfect num-
ber because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. There are
four perfect numbers 6 10,000. Write a program to find all these four numbers.
 */
public class Ex5_33 {
    public static void main(String[] args) {
        for (int i = 6; i < 10000; i++) {
            int sumOfDiv = 0;
            for (int d = 1; d <= i / 2; d++)
                if (i % d == 0)
                    sumOfDiv += d;
            if (sumOfDiv == i)
                System.out.println(i);
        }
    }
}

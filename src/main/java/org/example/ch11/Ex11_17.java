package org.example.ch11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
(Algebra: perfect square) Write a program that prompts the user to enter an integer m
and find the smallest integer n such that m * n is a perfect square. (Hint:
Store all smallest factors of m into an array list. n is the product of the factors that
appear an odd number of times in the array list. For example, consider m = 90,
store the factors 2, 3, 3, and 5 in an array list. 2 and 5 appear an odd number of
times in the array list. Thus, n is 10.)
 */
public class Ex11_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int m = scanner.nextInt();
        List<Integer> factors = new ArrayList<>();

        for (int div = 2; div < m / 2; div++) {
            while(m % div == 0) {
                factors.add(div);
                m /= div;
            }
        }
        factors.add(m);
        System.out.println(factors);

        int previous = 1;
        int result = 1;
        m = 1;
        for (Integer item : factors) {
            m *= item;
            if (item == Math.abs(previous)) {
                previous *= (-1);
            } else {
                if (previous > 0)
                    result *= previous;
                previous = item;
            }
        }
        if (previous > 0)
            result *= previous;
        System.out.println("The smallest number n for m * n to be a perfect square" +
                "is " + result);
        System.out.println("m * n is " + m * result);
    }
}

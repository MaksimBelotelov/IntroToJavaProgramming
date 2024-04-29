package org.example.ch5;

/*
    (Compute the greatest common divisor) Another solution for Listing 5.9 to find
    the greatest common divisor of two integers n1 and n2 is as follows: First find d
    to be the minimum of n1 and n2, then check whether d, d–1, d–2, ..., 2, or 1 is
    a divisor for both n1 and n2 in this order. The first such common divisor is the
    greatest common divisor for n1 and n2. Write a program that prompts the user to
    enter two positive integers and displays the gcd.
 */

import java.util.Scanner;

public class Ex5_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two positive integers: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int d = Math.min(n1, n2);

        while (true) {
            if (n1 % d == 0 && n2 % d == 0)
                break;
            d--;
        }

        System.out.printf("gcv of %d and %d is %d\n", n1, n2, d);
    }
}

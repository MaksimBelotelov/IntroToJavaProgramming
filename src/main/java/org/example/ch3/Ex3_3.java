package org.example.ch3;
/*
    (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
    Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
    the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
    that “The equation has no solution.”
 */

import java.util.Scanner;

public class Ex3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] c = new double[6];
        System.out.println("Enter a, b, c, d, e, f: ");
        for (int i = 0; i < 6; i++)
            c[i] = scanner.nextDouble();

        double denominator = c[0] * c[3] - c[1] * c[2];

        if (denominator != 0) {
            double x = ((c[4] * c[3] - c[1] * c[5]) / denominator);
            double y = ((c[0] * c[5] - c[4] * c[2]) / denominator);
            System.out.println("x is " + x + " and y is " + y);
        }
        else System.out.println("The equation has no solution");
    }
}

package org.example.ch8;
/*
(Algebra: solve linear equations) Write a method that solves the following 2 * 2
system of linear equations:
a00x + a01y = b0
a10x + a11y = b1

    b0a11 - b1a01
x = ---------------
    a00a11 - a01a10

    b1a00 - b0a10
y = ---------------
    a00a11 - a01a10

The method header is:

public static double[] linearEquation(double[][] a, double[] b)

The method returns null if a00a11 - a01a10 is 0. Write a test program that
prompts the user to enter a00, a01, a10, a11, b 0, and b1 and displays the result.
 */

import java.util.Scanner;

public class Ex8_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] a = new double[2][2];
        double[] b = new double[2];

        System.out.print("Enter a00, a01, a10, a11, b0, b1: ");
        a[0][0] = scanner.nextDouble();
        a[0][1] = scanner.nextDouble();
        a[1][0] = scanner.nextDouble();
        a[1][1] = scanner.nextDouble();
        b[0] = scanner.nextDouble();
        b[1] = scanner.nextDouble();

        double[] res = linearEquation(a, b);
        if (res != null)
            System.out.println("X = " + res[0] + " Y = " + res[1]);
        else
            System.out.println("No solution");
    }

    public static double[] linearEquation(double[][] a, double[] b) {
        double[] result = new double[2];
        double denominator = a[0][0] * a[1][1] - a[0][1] * a[1][0];
        if (denominator != 0) {
            result[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / denominator;
            result[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / denominator;

            return result;
        }
        else
            return null;
    }
}

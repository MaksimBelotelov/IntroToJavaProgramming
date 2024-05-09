package org.example.ch7;

import java.util.Scanner;

/*
(Algebra: solve quadratic equations) Write a method for solving a quadratic equa-
tion using the following header:

public static int solveQuadratic(double[] eqn, double[] roots)

The coefficients of a quadratic equation ax2 + bx + c = 0 are passed to the array
eqn and the real roots are stored in roots. The method returns the number of real
roots. See Programming Exercise 3.1 on how to solve a quadratic equation.
Write a program that prompts the user to enter values for a, b, and c and displays
the number of real roots and all real roots.
 */

public class Ex7_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] coefficients = new double[3];
        System.out.print("Enter a, b, c: ");
        for (int i = 0; i < 3; i++)
            coefficients[i] = scanner.nextDouble();

        double[] roots = new double[2];
        int numberOfRoots = solveQuadratic(coefficients, roots);

        System.out.println("Number of roots: " + numberOfRoots);
        if (numberOfRoots == 0)
            System.out.println("There is no roots");
        if (numberOfRoots > 0)
            System.out.println("Root1: " + roots[0]);
        if (numberOfRoots > 1)
            System.out.println("Root2: " + roots[1]);
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double d = b * b - 4 * a * c;

        if (d > 0) {
            roots[0] = ((-b) + Math.sqrt(d)) / (2 * a);
            roots[1] = ((-b) - Math.sqrt(d)) / (2 * a);
            return 2;
        }
        else if (d == 0) {
            roots[0] = -b / (2 * a);
            return 1;
        }
        else
            return 0;
    }
}

package org.example.ch13;

/*
(Algebra: solve quadratic equations) Rewrite Programming Exercise 3.1 to obtain
imaginary roots if the determinant is less than 0 using the Complex class in
Programming Exercise 13.17.
 */

import java.util.Scanner;

public class Ex13_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = b * b - 4 * a * c;

        if (d < 0) {
            Complex root1 = new Complex(-b / (2 * a), Math.pow(-d, 0.5) / (2 * a));
            Complex root2 = new Complex(-b / (2 * a), -Math.pow(-d, 0.5) / (2 * a));
            System.out.println(root1 + "  " + root2);
        }
        else if (d > 0) {
            double root1 = (-b + Math.pow(d, 0.5)) / (2 * a);
            double root2 = (-b - Math.pow(d, 0.5)) / (2 * a);
            System.out.println(root1 + " " + root2);
        }
        else {
            double root = -b / (2 * a);
            System.out.println(root);
        }
    }
}

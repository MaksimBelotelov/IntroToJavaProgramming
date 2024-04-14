package org.example.ch3;

import java.util.Scanner;

/*
    (Algebra: solve quadratic equations) The two roots of a quadratic equation
    ax2 + bx + c = 0 can be obtained using the following formula:

    b 2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
    equation has two real roots. If it is zero, the equation has one root. If it is nega-
    tive, the equation has no real roots.
    Write a program that prompts the user to enter values for a, b, and c and displays
    the result based on the discriminant. If the discriminant is positive, display two
    roots. If the discriminant is 0, display one root. Otherwise, display “The equation
    has no real roots.”
 */
public class Ex3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            double r1 = (-b + Math.pow(d, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2 * a);
            System.out.println("The equation has two roots: " + r1 + " and " + r2);
        }
        else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("The equation has one root: " + r);
        }
        else
            System.out.println("The equation has no real roots");
    }
}

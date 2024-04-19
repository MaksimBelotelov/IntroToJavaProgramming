package org.example.ch3;

/*
     (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and
    (x2, y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a and b.
    The intersecting point of the two lines can be found by solving the following
    linear equations:
    (y1 - y 2)x - (x1 - x2)y = (y1 - y 2)x1 - (x1 - x2)y1
    (y3 - y 4)x - (x3 - x4)y = (y3 - y 4)x3 - (x3 - x4)y3
    This linear equation can be solved using Cramer’s rule (see Programming
    Exercise 3.3). If the equation has no solutions, the two lines are parallel
    Write a program that prompts the user to enter four points and displays
    the intersecting point.
 */

import java.util.Scanner;

public class Ex3_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        double a = (y1 - y2);
        double b = -(x1 - x2);
        double c = (y3 - y4);
        double d = -(x3 - x4);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        double denominator = a * d - b * c;
        if (denominator == 0)
            System.out.println("Lines are parallel");
        else {
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;
            System.out.printf("The intersecting point is at (%f, %f)", x, y);
        }
    }
}

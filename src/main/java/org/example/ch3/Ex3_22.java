package org.example.ch3;

/*
    (Geometry: point in a circle?) Write a program that prompts the user to enter a
    point (x, y) and checks whether the point is within the circle centered at (0, 0)
    with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
    circle.
 */

import java.util.Scanner;

public class Ex3_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double s = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.printf("Point (%.1f, %.1f) is " + ((s > 10) ? "not ": "")  + "in the circle", x, y);
    }
}

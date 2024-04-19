package org.example.ch3;
/*
    Suppose a right triangle is placed in a plane as
    shown below. The right-angle point is placed at (0, 0), and the other two points
    are placed at (200, 0) and (0, 100). Write a program that prompts the user to enter
    a point with x- and y-coordinates and determines whether the point is inside the
    triangle.
 */
import java.util.Scanner;

public class Ex3_27 {
    public static void main(String[] args) {
        final double x1 = 0;
        final double y1 = 100;
        final double x2 = 0;
        final double y2 = 0;
        final double x3 = 200;
        final double y3 = 0;

        final double s = (100 * 200) / 2.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a point's x and y coordinates: ");

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double area1 = 0.5 * Math.abs((x - x1)*(y2 - y1) - (x2 - x1)*(y - y1));
        double area2 = 0.5 * Math.abs((x - x2)*(y3 - y2) - (x3 - x2)*(y - y2));
        if (s >= area1 + area2)
            System.out.println("The point is inside the triangle");
        else
            System.out.println("The point is outside the triangle");
    }
}

package org.example.ch2;

import java.util.Scanner;

/*
    (Geometry: area of a triangle) Write a program that prompts the user to enter
    three points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays
    its area.
 */
public class Ex2_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coordinates of three points separated by spaces: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double side1 = side(x1, y1, x2, y2);
        double side2 = side(x2, y2, x3, y3);
        double side3 = side(x3, y3, x1, y1);

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.println("The area of the triangle is " + area);
    }

    public static double side(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}

package org.example.ch4;

/*
    (Geometry: area of a pentagon) Write a program that prompts the user to enter
    the length from the center of a pentagon to a vertex and computes the area of the
    pentagon, as shown in the following figure. Round up two digits
    after the decimal point.
 */

import java.util.Scanner;

public class Ex4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double r = scanner.nextDouble();
        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("The area of the pentagon is %.2f", area);
    }
}

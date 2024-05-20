package org.example.ch8;

/*
(Geometry: same line?) Programming Exercise 6.39 gives a method for testing
whether three points are on the same line.
Write the following method to test whether all the points in the array points are
on the same line:
public static boolean sameLine(double[][] points)
Write a program that prompts the user to enter five points and displays whether
they are on the same line.
 */

import java.util.Scanner;

public class Ex8_15 {
    public static void main(String[] args) {
        int size = 5;
        double[][] points = new double[size][2];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter five points: ");
        for (int i = 0; i < size; i++) {
            points[i][0] = scanner.nextDouble();
            points[i][1] = scanner.nextDouble();
        }
        if (sameLine(points))
            System.out.println("The points are on the same line");
        else
            System.out.println("The points are not on the same line");
    }

    public static boolean sameLine(double[][] points) {
        for (int i = 0; i < points.length - 3; i++) {
            if ((points[i + 1][0] - points[i][0]) * (points[i + 2][1] - points[i][1]) -
                    (points[i + 2][0] - points[i][0]) * (points[i + 1][1] - points[i][1]) != 0)
                return false;
        }
        return true;
    }
}

package org.example.ch3;

/*
    (Geometry: two rectangles) Write a program that prompts the user to enter the
    center x-, y-coordinates, width, and height of two rectangles and determines
    whether the second rectangle is inside the first or overlaps with the first
*/

import java.util.Scanner;

public class Ex3_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y- coordinates, width and height: ");
        double centerXFirstRectangle = scanner.nextDouble();
        double centerYFirstRectangle = scanner.nextDouble();
        double firstRectangleWidth = scanner.nextDouble();
        double firstRectangleHeight = scanner.nextDouble();

        System.out.print("Enter r2's center x-, y- coordinates, width and height: ");
        double centerXSecondRectangle = scanner.nextDouble();
        double centerYSecondRectangle = scanner.nextDouble();
        double secondRectangleWidth = scanner.nextDouble();
        double secondRectangleHeight = scanner.nextDouble();

        double xDistanceBetweenCenters = Math.abs(centerXFirstRectangle - centerXSecondRectangle);
        double yDistanceBetweenCenters = Math.abs(centerYFirstRectangle - centerYSecondRectangle);

        if (xDistanceBetweenCenters <= (firstRectangleWidth / 2 + secondRectangleWidth / 2) &&
            yDistanceBetweenCenters <= (firstRectangleHeight / 2 + secondRectangleHeight / 2)) {
            if(xDistanceBetweenCenters + secondRectangleWidth / 2 <= firstRectangleWidth / 2 &&
                    yDistanceBetweenCenters + secondRectangleHeight /2 <= firstRectangleHeight / 2) {
                System.out.println("rectangle 2 is inside rectangle 1");
            }
            else if (xDistanceBetweenCenters + firstRectangleWidth / 2 <= secondRectangleWidth / 2 &&
                    yDistanceBetweenCenters + firstRectangleHeight / 2 <= secondRectangleHeight / 2) {
                System.out.println("rectangle 1 is inside rectangle 2");
            }
            else {
                System.out.println("rectangle 2 overlaps rectangle 1");
            }
        }
        else {
            System.out.println("Rectangles are not overlap");
        }
    }
}

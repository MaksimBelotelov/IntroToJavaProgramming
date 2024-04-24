package org.example.ch4;

/*
    (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point
    at the 0 o’clock position, as shown in Figure 4.4c. Write a program that prompts
    the user to enter the radius of the bounding circle of a pentagon and displays the
    coordinates of the five corner points on the pentagon from p1 to p5 in this order. Use
    console format to display two digits after the decimal point.
*/

import java.util.Scanner;

public class Ex4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = scanner.nextDouble();
        double angle = 2 * Math.PI / 5;
        double currentAngle = Math.PI / 2 - angle;
        for (int i = 0; i < 5; i++) {
            double x = radius * Math.cos(currentAngle);
            double y = radius * Math.sin(currentAngle);
            System.out.printf("(%.2f, %.2f)\n", x, y);
            currentAngle += angle;
        }
    }
}

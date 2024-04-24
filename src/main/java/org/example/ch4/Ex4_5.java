package org.example.ch4;

/*
    (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
    in which all sides are of the same length and all angles have the same degree (i.e.,
    the polygon is both equilateral and equiangular).
*/

import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int numberOfSides = scanner.nextInt();
        System.out.print("Enter the side: ");
        double side = scanner.nextDouble();
        double area = (numberOfSides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / numberOfSides));
        System.out.println("The area of the polygon is " + area);
    }
}

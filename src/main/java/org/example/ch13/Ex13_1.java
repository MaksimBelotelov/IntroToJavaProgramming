package org.example.ch13;

/*
(Triangle class) Design a new Triangle class that extends the abstract
GeometricObject class. Draw the UML diagram for the classes Triangle and
GeometricObject then implement the Triangle class. Write a test program
that prompts the user to enter three sides of the triangle, a color, and a Boolean
value to indicate whether the triangle is filled. The program should create a Triangle
object with these sides, and set the color and filled properties using the
input. The program should display the area, perimeter, color, and true or false to
indicate whether it is filled or not.
*/

import java.util.Scanner;

public class Ex13_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter color: ");
        String color = scanner.nextLine();
        System.out.println("Should the triangle be filled? (y/n): ");
        char answer = scanner.nextLine().charAt(0);
        boolean filled = (answer == 'Y' || answer == 'y');

        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Is filled: " + triangle.isFilled());
    }
}

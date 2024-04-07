package org.example.ch2;

import java.util.Scanner;

/*
    (Compute the volume of a cylinder) Write a program that reads in the radius
    and length of a cylinder and computes the area and volume using the following
    formulas:
    area = radius * radius * π
    volume = area * length
*/
public class Ex2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();
        double area = radius * radius * Math.PI;
        System.out.println("The area is " + area);
        double volume = area * length;
        System.out.println("The volume is " + volume);
    }
}
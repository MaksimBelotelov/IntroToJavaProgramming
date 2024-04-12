package org.example.ch2;

/*
    (Geometry: area of a hexagon) Write a program that prompts the user to enter the
    side of a hexagon and displays its area.
 */

import java.util.Scanner;

public class Ex2_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        double len = scanner.nextDouble();
        double result = (3 * Math.pow(3, 0.5) * Math.pow(len, 2)) / 2;
        System.out.println("The area of the hexagon is " + result);
    }
}

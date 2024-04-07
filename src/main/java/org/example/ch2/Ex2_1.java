package org.example.ch2;

import java.util.Scanner;

/*
    (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a
    double value from the console, then converts it to Fahrenheit, and displays the
    result.
 */
public class Ex2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + "Fahrenheit");
    }
}
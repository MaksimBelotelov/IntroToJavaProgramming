package org.example.ch3;

/*
    (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula to
    compute the wind-chill temperature. The formula is valid for temperatures in the
    range between -58°F and 41°F and wind speed greater than or equal to 2 . Write
    a program that prompts the user to enter a temperature and a wind speed. The
    program displays the wind-chill temperature if the input is valid; otherwise, it dis-
    plays a message indicating whether the temperature and/or wind speed is invalid.
 */

import java.util.Scanner;

public class Ex3_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the wind speed ( >= 2) in miles per hour: ");
        double windSpeed = scanner.nextDouble();

        if (temperature < -58 || temperature > 41) {
            System.out.println("Incorrect temperature");
            System.exit(1);
        }

        if (windSpeed <= 2) {
            System.out.println("Incorrect speed of wind");
            System.exit(2);
        }

        double twc = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 *
            temperature * Math.pow(windSpeed, 0.16);
        System.out.println("The wind chill index is " + twc);
    }
}

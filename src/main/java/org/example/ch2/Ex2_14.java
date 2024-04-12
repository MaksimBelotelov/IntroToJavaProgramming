package org.example.ch2;

import java.util.Scanner;

/*
    (Health application: computing BMI) Body Mass Index (BMI) is a measure of
    health on weight. It can be calculated by taking your weight in kilograms and divid-
    ing, by the square of your height in meters. Write a program that prompts the user to
    enter a weight in pounds and height in inches and displays the BMI. Note one pound
    is 0.45359237 kilograms and one inch is 0.0254 meters.
 */
public class Ex2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = scanner.nextDouble();
        double bmi = (weight * 0.45359237) / Math.pow((height * 0.0254), 2);
        System.out.println("BMI is " + bmi);
    }
}

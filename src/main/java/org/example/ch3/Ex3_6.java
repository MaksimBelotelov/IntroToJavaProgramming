package org.example.ch3;

/*
    (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
    let the user enter weight, feet, and inches. For example, if a person is 5 feet and
    10 inches, you will enter 5 for feet and 10 for inches.
 */

import java.util.Scanner;

public class Ex3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight(pounds): ");
        double weight = scanner.nextDouble();
        System.out.println("Enter feet and inches: ");
        double feet = scanner.nextDouble();
        double inches = scanner.nextDouble();

        double height = feet * 12 + inches;
        double bmi = weight * 0.45359237 / Math.pow(height * 0.0254, 2);
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 25) System.out.println("Normal");
        else System.out.println("Overweight");
    }
}

package org.example.ch2;

import java.util.Scanner;

/*
    (Physics: acceleration) Average acceleration is defined as the change of velocity
    divided by the time taken to make the change, as given by the following formula:
        v1 - v0
    a = --------
           t
    Write a program that prompts the user to enter the starting velocity v0 in meters/
    second, the ending velocity v1 in meters/second, and the time span t in seconds,
    then displays the average acceleration.
 */
public class Ex2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter v0, v1 and t, separated by space: ");
        double v0 = scanner.nextDouble();
        double v1 = scanner.nextDouble();
        double t = scanner.nextDouble();
        double a = (v1 - v0) / t;
        System.out.println("The average acceleration is " + a);
    }
}

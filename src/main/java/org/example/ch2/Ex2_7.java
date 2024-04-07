package org.example.ch2;

/*
    (Find the number of years) Write a program that prompts the user to enter the
    minutes (e.g., 1 billion), and displays the maximum number of years and remain-
    ing days for the minutes. For simplicity, assume that a year has 365 days. Here is
    a sample run:
 */

import java.util.Scanner;

public class Ex2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();
        int years = minutes / 525600;
        int remainMins = minutes % 525600;
        int days = remainMins / 1440;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}

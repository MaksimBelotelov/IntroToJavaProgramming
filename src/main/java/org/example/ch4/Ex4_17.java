package org.example.ch4;

import java.util.Scanner;

/*
    (Days of a month) Write a program that prompts the user to enter the year and the
    first three letters of a month name (with the first letter in uppercase) and displays
    the number of days in the month. If the input for month is incorrect, display a
    message
 */

public class Ex4_17 {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.print("Enter a month: ");
        scanner.nextLine();
        String month = scanner.nextLine();
        int monthNumber = 0;
        int days = 0;
        for (int i = 0; i < 12; i++) {
            if (month.equals(months[i])) {
                monthNumber = i + 1;
                break;
            }
        }
        if (monthNumber != 0) {
            if (monthNumber == 2) {
                if (((year % 100 == 0) && (year % 400 == 0)) || (year % 100 != 0 && year % 4 == 0))
                    days = 29;
                else days = 28;
            }
            else if (monthNumber < 8) days = 30 + (monthNumber % 2);
            else days = 30 + ((monthNumber % 2 == 0) ? 1 : 0);

            System.out.println("Number of days is " + days);
        }
        else
            System.out.println("Incorrect input");
    }
}

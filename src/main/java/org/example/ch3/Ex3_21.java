package org.example.ch3;

/*
    (Science: day of the week) Zeller’s congruence is an algorithm developed by
    Christian Zeller to calculate the day of the week.
    Note all divisions in this exercise perform an integer division. Write a program
    that prompts the user to enter a year, month, and day of the month, and displays
    the name of the day of the week.
 */

import java.util.Scanner;

public class Ex3_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month(1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the day of the month(1-31): ");
        int dayOfMonth = scanner.nextInt();
        if (month == 1 || month ==2) {
            month += 12;
            year--;
        }
        int h = (dayOfMonth + (26 * (month + 1))/10 + (year % 100) + (year % 100) / 4 +
                (year / 100) / 4 + 5 * (year/100)) % 7;

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.println("Day of the week is " + days[h]);
    }
}

package org.example.ch5;

/*
(Display the first days of each month) Write a program that prompts the user to
enter the year and first day of the year, then displays the first day of each month
in the year. For example, if the user entered the year 2013, and 2 for Tuesday,
January 1, 2013, your program should display the following output:
January 1, 2013 is Tuesday
...
December 1, 2013 is Sunday
 */

import java.util.Scanner;

public class Ex5_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the first day of the year: ");
        int firstDay = scanner.nextInt();

        String[] months = {"January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October",
            "November", "December"};

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};

        for (int month = 1; month <= 12; month++) {
            int numberOfDaysInMonth = 30;
            if (month == 2) {
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                    numberOfDaysInMonth = 29;
                else
                    numberOfDaysInMonth = 28;
            }
            else if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
                numberOfDaysInMonth = 31;
            }

            System.out.println(months[month - 1] + " 1, " + year + " is "
                + daysOfWeek[firstDay]);

            firstDay = (firstDay + numberOfDaysInMonth) % 7;
        }
    }
}

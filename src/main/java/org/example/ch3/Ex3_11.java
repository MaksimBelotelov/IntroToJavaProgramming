package org.example.ch3;

/*
    (Find the number of days in a month) Write a program that prompts the user
    to enter the month and year and displays the number of days in the month. For
    example, if the user entered month 2 and year 2012, the program should display
    that February 2012 has 29 days. If the user entered month 3 and year 2015, the
    program should display that March 2015 has 31 days.
 */

import java.util.Scanner;

public class Ex3_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month and year: ");
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        int days = 0;

        if (month == 2) {
            if (((year % 100 == 0) && (year % 400 == 0)) || (year % 100 != 0 && year % 4 == 0))
                days = 29;
            else days = 28;
        }
        else if (month < 8) days = 30 + (month % 2);
        else days = 30 + ((month % 2 == 0) ? 1 : 0) ;

        System.out.println("Number of days is " + days);
    }
}

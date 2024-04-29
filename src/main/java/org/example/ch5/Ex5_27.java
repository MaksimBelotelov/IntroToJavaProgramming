package org.example.ch5;

/*
(Display leap years) Write a program that displays all the leap years, 10 per line,
from 101 to 2100, separated by exactly one space. Also display the number of
leap years in this period.
 */

public class Ex5_27 {
    public static void main(String[] args) {
        int counter = 0;

        for (int year = 101; year <= 2100; year++) {
            if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
                System.out.print(year + ((counter++ % 10 == 0) ? "\n" : " "));
            }
        }
        System.out.println("\nNumber of leap years: " + counter);
    }
}

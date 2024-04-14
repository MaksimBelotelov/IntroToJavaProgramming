package org.example.ch3;

/*
    (Find future dates) Write a program that prompts the user to enter an integer for
    today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
    prompt the user to enter the number of days after today for a future day and dis-
    play the future day of the week.
 */

import java.util.Scanner;

public class Ex3_5 {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Enter today's day: ");
        Scanner scanner = new Scanner(System.in);
        int today = scanner.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int daysElapsed = scanner.nextInt();
        System.out.println("Today is " + daysOfWeek[today] + " and the future day is " +
                daysOfWeek[(today + daysElapsed) % 7]);
    }
}

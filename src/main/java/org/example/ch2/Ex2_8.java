package org.example.ch2;

import java.util.Scanner;

/*
    (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
    the current time in GMT. Revise the program so it prompts the user to enter the
    time zone offset to GMT and displays the time in the specified time zone.
 */
public class Ex2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = scanner.nextInt();

        long totalMillis = System.currentTimeMillis();

        long totalSeconds = totalMillis / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + offset) % 24 ;

        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}

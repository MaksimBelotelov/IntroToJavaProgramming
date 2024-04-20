package org.example.ch3;

/*
    (Current time) Revise Programming Exercise 2.8 to display the hour using a
    12-hour clock.
*/

import java.util.Scanner;

public class Ex3_30 {
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

        if (currentHour > 12)
            System.out.println("The current time is " + currentHour % 12 + ":" +
                    currentMinute + ":" + currentSecond + " PM");
        else
            System.out.println("The current time is " + currentHour + ":" +
                    currentMinute + ":" + currentSecond + " AM");
    }
}

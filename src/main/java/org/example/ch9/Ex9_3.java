package org.example.ch9;

import java.util.Date;

/*
(Use the Date class) Write a program that creates a Date object, sets its elapsed
time to 10000, 100000 , 1000000 , 10000000, 100000000 , 1000000000,
10000000000, and 100000000000, and displays the date and time using the
toString() method, respectively.
 */
public class Ex9_3 {
    public static void main(String[] args) {
        long[] elapsedTimes = {10000, 100000, 1000000, 10000000L, 100000000L,
                1000000000L, 10000000000L, 100000000000L};
        for (int i = 0; i < elapsedTimes.length; i++) {
            Date date = new Date(elapsedTimes[i]);
            System.out.println(date);
        }
    }
}

package org.example.ch9;

import java.util.GregorianCalendar;

/*
(Use the GregorianCalendar class) Java API has the GregorianCalendar
class in the java.util package, which you can use to obtain the year, month, and
day of a date. The no-arg constructor constructs an instance for the current date,
and the methods get(GregorianCalendar.YEAR), get(GregorianCalen-
dar.MONTH), and get(GregorianCalendar.DAY_OF_MONTH) return the year,
month, and day. Write a program to perform two tasks:
1. Display the current year, month, and day.
2. The GregorianCalendar class has the setTimeInMillis(long), which
can be used to set a specified elapsed time since January 1, 1970. Set the value
to 1234567898765L and display the year, month, and day.
 */
public class Ex9_5 {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR) + " " +
                gregorianCalendar.get(GregorianCalendar.MONTH) + " " +
                gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));

        System.out.println("--------------------------------------");
        gregorianCalendar.setTimeInMillis(1234567898765L);
        System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR) + " " +
                gregorianCalendar.get(GregorianCalendar.MONTH) + " " +
                gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}

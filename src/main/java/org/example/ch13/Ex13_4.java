package org.example.ch13;

/*
(Display calendars) Rewrite the PrintCalendar class in Listing 6.12 to display
a calendar for a specified month using the Calendar and GregorianCalendar
classes. Your program receives the month and year from the command line. For
example:

java Exercise13_04 5 2016

 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex13_4 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();

        if (args.length > 0)
            calendar.set(Calendar.MONTH, Integer.parseInt(args[0]) - 1);
        if (args.length == 2)
            calendar.set(Calendar.YEAR, Integer.parseInt(args[1]));
        calendar.set(Calendar.DATE, 1);

        System.out.println(Months.values()[calendar.get(Calendar.MONTH)] +
                " " + calendar.get(Calendar.YEAR));


        System.out.println("---------------------------------------");
        System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");

        int currentDay = calendar.get(Calendar.DAY_OF_WEEK);

        for (int i = 1; i < currentDay; i++)
            System.out.print("      ");
        for (int day = 1; day < calendar.getActualMaximum(Calendar.DAY_OF_MONTH); day++) {
            System.out.printf("%3d   ", day);
            if (currentDay % 7 == 0)
                System.out.println("\n");
            currentDay++;
        }
    }
}

enum Months {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

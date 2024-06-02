package org.example.ch10;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
(The MyDate class) Design a class named MyDate. The class contains:
■■ The data fields year, month, and day that represent a date. month is 0-based,
i.e., 0 is for January.
■■ A no-arg constructor that creates a MyDate object for the current date.
■■ A constructor that constructs a MyDate object with a specified elapsed time
since midnight, January 1, 1970, in milliseconds.
■■ A constructor that constructs a MyDate object with the specified year, month,
and day.
■■ Three getter methods for the data fields year, month, and day, respectively.
■■ A method named setDate(long elapsedTime) that sets a new date for
the object using the elapsed time.
Draw the UML diagram for the class then implement the class. Write a test
program that creates two MyDate objects (using new MyDate() and new
MyDate(34355555133101L)) and displays their year, month, and day.
(Hint: The first two constructors will extract the year, month, and day
from the elapsed time. For example, if the elapsed time is 561555550000
milliseconds, the year is 1987, the month is 9, and the day is 18. You may
use the GregorianCalendar class discussed in Programming Exercise 9.5
to simplify coding.)
 */
public class Ex10_14 {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate();
        MyDate myDate2 = new MyDate(34355555133101L);

        System.out.println(myDate1);
        System.out.println(myDate2);
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        this.year = gregorianCalendar.get(Calendar.YEAR);
        this.month = gregorianCalendar.get(Calendar.MONTH);
        this.day = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(long elapsedTime) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(elapsedTime);
        this.year = gregorianCalendar.get(Calendar.YEAR);
        this.month = gregorianCalendar.get(Calendar.MONTH);
        this.day = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(elapsedTime);
        this.year = gregorianCalendar.get(Calendar.YEAR);
        this.month = gregorianCalendar.get(Calendar.MONTH);
        this.day = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public String toString() {
        return  "year=" + year +
                ", month=" + month +
                ", day=" + day;
    }
}

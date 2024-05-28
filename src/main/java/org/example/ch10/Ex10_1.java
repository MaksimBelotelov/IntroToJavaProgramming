package org.example.ch10;

import java.util.Date;

/*
 (The Time class) Design a class named Time. The class contains:
■■ The data fields hour, minute, and second that represent a time.
■■ A no-arg constructor that creates a Time object for the current time. (The
values of the data fields will represent the current time.)
■■ A constructor that constructs a Time object with a specified elapsed time
since midnight, January 1, 1970, in milliseconds. (The values of the data
fields will represent this time.)
■■ A constructor that constructs a Time object with the specified hour, minute,
and second.
■■ Three getter methods for the data fields hour , minute , and second,
respectively.
■■ A method named setTime(long elapseTime) that sets a new time for the
object using the elapsed time. For example, if the elapsed time is 555550000
milliseconds, the hour is 10, the minute is 19, and the second is 10.
Draw the UML diagram for the class then implement the class. Write a
test program that creates three Time objects (using new Time() , new
Time(555550000), and new Time(5, 23, 55)) and displays their hour,
minute, and second in the format hour:minute:second.
(Hint: The first two constructors will extract the hour, minute, and second
from the elapsed time. For the no-arg constructor, the current time can be
obtained using System.currentTimeMillis(), as shown in Listing 2.7,
ShowCurrentTime.java. Assume the time is in GMT.)
 */
public class Ex10_1 {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(5, 23, 55);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
    }
}

class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        second = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        minute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        hour = (int)(totalHours % 24);
    }

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() { return hour; }
    public int getMinute() { return minute;}
    public int getSecond() { return second; }

    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        second = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        minute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        hour = (int)(totalHours % 24);
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}

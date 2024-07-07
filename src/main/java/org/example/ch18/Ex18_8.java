package org.example.ch18;

/*
(Print the digits in an integer reversely) Write a recursive method that displays
an int value reversely on the console using the following header:

public static void reverseDisplay(int value)

For example, reverseDisplay(12345) displays 54321. Write a test program
that prompts the user to enter an integer and displays its reversal.
*/

public class Ex18_8 {
    public static void main(String[] args) {
        reverseDisplay(12345);
    }

    public static void reverseDisplay(int value) {
        if (value / 10 == 0) System.out.print(value);
        else  {
            System.out.print(value % 10);
            reverseDisplay(value / 10);
        }
    }
}

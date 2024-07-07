package org.example.ch18;

/*
(Print the characters in a string reversely) Write a recursive method that
displays a string reversely on the console using the following header:

public static void reverseDisplay(String value)

For example, reverseDisplay("abcd") displays dcba. Write a test program
that prompts the user to enter a string and displays its reversal.
*/

public class Ex18_9 {
    public static void main(String[] args) {
        reverseDisplay("abcd");
    }

    public static void reverseDisplay(String value) {
        if (value.isEmpty()) System.out.print("");
        else {
            int lastCharIndex = value.length() - 1;
            System.out.print(value.charAt(lastCharIndex));
            reverseDisplay(value.substring(0, lastCharIndex));
        }
    }
}

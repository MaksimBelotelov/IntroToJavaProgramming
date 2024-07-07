package org.example.ch18;

import java.util.Scanner;

/*
(Occurrences of a specified character in an array) Write a recursive method that
finds the number of occurrences of a specified character in an array. You need to
define the following two methods. The second one is a recursive helper method.

public static int count(char[] chars, char ch)
public static int count(char[] chars, char ch, int high)

Write a test program that prompts the user to enter a list of characters in one line,
and a character, and displays the number of occurrences of the character in the list.
*/

public class Ex18_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of characters: ");
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        System.out.print("Enter a character to count: ");
        char ch = scanner.nextLine().charAt(0);

        System.out.println(count(chars, ch));
    }

    public static int count(char[] chars, char ch) {
        return count(chars, ch, chars.length - 1);
    }

    public static int count(char[] chars, char ch, int high) {
        if (high == -1)
            return 0;
        else {
            return (chars[high] == ch ? 1 : 0) +
                    count(chars, ch, high - 1);
        }
    }
}

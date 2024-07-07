package org.example.ch18;

/*
(Find the number of uppercase letters in an array) Write a recursive method
to return the number of uppercase letters in an array of characters. You need to
define the following two methods. The second one is a recursive helper method.

public static int count(char[] chars)
public static int count(char[] chars, int high)

Write a test program that prompts the user to enter a list of characters in one line
and displays the number of uppercase letters in the list.
*/

import java.util.Scanner;

public class Ex18_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string of characters: ");
        String string = scanner.nextLine();
        char[] chars = string.toCharArray();
        System.out.println(count(chars));
    }

    public static int count(char[] chars) {
        return count(chars, chars.length - 1);
    }

    public static int count(char[] chars, int high) {
        if (high == -1)
            return 0;
        else {
            return ((Character.isUpperCase(chars[high])) ? 1 : 0) +
                    count(chars, high - 1);
        }
    }
}
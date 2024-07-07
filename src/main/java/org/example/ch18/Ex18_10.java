package org.example.ch18;

/*
(Occurrences of a specified character in a string) Write a recursive method that
finds the number of occurrences of a specified letter in a string using the
following method header:

public static int count(String str, char a)

For example, count("Welcome", 'e') returns 2. Write a test program that
prompts the user to enter a string and a character, and displays the number of
occurrences for the character in the string.
*/

import java.util.Scanner;

public class Ex18_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String string = scanner.nextLine();
        System.out.print("Enter character to count: ");
        char ch = scanner.nextLine().charAt(0);
        System.out.println("Number of occurrences is: " + count(string, ch));
    }

    public static int count(String str, char a) {
        int result = 0;
        if (str.isEmpty()) return 0;
        result = ((str.charAt(0) == a) ? 1 : 0) + count(str.substring(1), a);
        return result;
    }
}

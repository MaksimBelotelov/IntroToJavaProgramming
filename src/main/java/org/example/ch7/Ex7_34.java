package org.example.ch7;

import java.util.Arrays;
import java.util.Scanner;

/*
(Sort characters in a string) Write a method that returns a sorted string using the
following header:
public static String sort(String s)
For example, sort("acb") returns abc.
Write a test program that prompts the user to enter a string and displays the sorted
string.
 */
public class Ex7_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String input = scanner.nextLine();
        System.out.println(sort(input));
    }

    public static String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

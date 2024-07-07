package org.example.ch18;

/*
(Find the number of uppercase letters in a string) Write a recursive method
to return the number of uppercase letters in a string. Write a test program that
prompts the user to enter a string and displays the number of uppercase letters in
the string.
 */

import java.util.Scanner;

public class Ex18_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String string = scanner.nextLine();
        System.out.println("Number of uppercase letters: " + numberOfUppercaseLetters(string));
    }

    public static int numberOfUppercaseLetters(String str) {
        return numberOfUppercaseLetters(str, str.length() - 1);
    }

    public static int numberOfUppercaseLetters(String str, int lastLetterIndex) {
        if (lastLetterIndex == -1) {
            return 0;
        }
        else {
            return ((Character.isUpperCase(str.charAt(lastLetterIndex))) ? 1 : 0) +
                    numberOfUppercaseLetters(str, lastLetterIndex - 1);
        }
    }
}

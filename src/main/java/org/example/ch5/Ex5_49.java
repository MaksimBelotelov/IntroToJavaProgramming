package org.example.ch5;

import java.util.Scanner;

/*
(Count vowels and consonants) Assume that the letters A, E, I, O, and U are vow-
els. Write a program that prompts the user to enter a string, and displays the
number of vowels and consonants in the string.
 */
public class Ex5_49 {
    public static void main(String[] args) {
        final String vowels = "AaEeIiOoUu";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int vowelsCounter = 0;
        int consonantCounter = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if(vowels.indexOf(ch) != -1)
                vowelsCounter++;
            else if (ch != ' ')
                consonantCounter++;
        }
        System.out.println("The number of vowels: " + vowelsCounter);
        System.out.println("The number of consonants: " + consonantCounter);
    }
}

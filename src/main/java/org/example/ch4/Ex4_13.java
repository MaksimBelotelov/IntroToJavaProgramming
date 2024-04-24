package org.example.ch4;

/*
    (Vowel or consonant?) Write a program that prompts the user to enter a letter and
    check whether the letter is a vowel or consonant. For a nonletter input, display
    invalid input.
 */

import java.util.Scanner;

public class Ex4_13 {
    public static void main(String[] args) {
        String vowels = "aeiouy";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String input = scanner.nextLine();
        if (Character.isLetter(input.charAt(0))) {
            if (vowels.contains(input.toLowerCase()))
                System.out.println(input + " is a vowel");
            else
                System.out.println(input + " is a consonant");
        }
        else
            System.out.println("invalid input");
    }
}

package org.example.ch5;

/*
(Process string) Write a program that prompts the user to enter a string and dis-
plays the characters at odd positions. Here is a sample run:
 */

import java.util.Scanner;

public class Ex5_48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        for (int i = 0; i < inputString.length(); i++) {
            if (i % 2 == 0)
                System.out.print(inputString.charAt(i));
        }
    }
}

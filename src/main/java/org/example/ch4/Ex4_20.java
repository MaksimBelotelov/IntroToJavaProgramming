package org.example.ch4;

/*
    (Process a string) Write a program that prompts the user to enter a string and
    displays its length and its first character.
 */

import java.util.Scanner;

public class Ex4_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some string: ");
        String input = scanner.nextLine();
        System.out.println("String length: " + input.length());
        System.out.println("First character is " + input.charAt(0));
    }
}

package org.example.ch4;

/*
    (Find the Unicode of a character) Write a program that receives a character and
    displays its Unicode.
 */

import java.util.Scanner;

public class Ex4_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String input = scanner.nextLine();
        char ch = input.charAt(0);
        System.out.println("The Unicode for character " + ch + " is " + (int)(ch));
    }
}

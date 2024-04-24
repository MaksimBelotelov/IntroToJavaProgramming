package org.example.ch4;

/*
    (Find the character of an ASCII code) Write a program that receives an ASCII code
    (an integer between 0 and 127 ) and displays its character.
 */

import java.util.Scanner;

public class Ex4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int code = scanner.nextInt();
        char symbol = (char)(code);
        System.out.println("The character for ASCII code " + code + " is " + symbol);
    }
}

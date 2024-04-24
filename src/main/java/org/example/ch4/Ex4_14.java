package org.example.ch4;

/*
    (Convert letter grade to number) Write a program that prompts the user to enter
    a letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3,
    2, 1, or 0. For other input, display invalid grade.
 */

import java.util.Scanner;

public class Ex4_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String input = scanner.nextLine();
        char ch = input.charAt(0);
        int grade = 4;
        if (input.length() == 1 && ch >= 'A' && ch <= 'F') {
            grade -= (ch - 'A');
            System.out.println("The numeric value for grade " + ch + " is " + grade);
        }
        else
            System.out.println(ch + " is an invalid grade");
    }
}

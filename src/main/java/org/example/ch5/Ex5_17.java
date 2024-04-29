package org.example.ch5;

/*
(Display pyramid) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid
 */

import java.util.Scanner;

public class Ex5_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = scanner.nextInt();

        for (int i = 1; i <= lines; i++) {
            int spaces = lines - i;
            for (int j = 0; j < spaces; j++)
                System.out.print("  ");

            for (int j = i; j > 1; j--)
                System.out.print(j + " ");

            for(int j = 1; j <= i; j++)
                System.out.print(j + " ");

            System.out.println();
        }
    }
}

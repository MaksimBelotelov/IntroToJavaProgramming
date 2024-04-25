package org.example.ch4;

/*
    (Student major and status) Write a program that prompts the user to enter two
    characters and displays the major and status represented in the characters. The
    first character indicates the major and the second is a number character 1, 2, 3, or
    4, which indicates whether a student is a freshman, sophomore, junior, or senior.
    Suppose that the following characters are used to denote the majors:
    M: Mathematics
    C: Computer Science
    I: Information Technology
 */

import java.util.Scanner;

public class Ex4_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String input = scanner.nextLine();
        char firstChar = input.charAt(0);

        if (firstChar == 'M')
            System.out.print("Mathematics ");
        else if (firstChar == 'C')
            System.out.print("Computer Science ");
        else if (firstChar == 'I')
            System.out.print("Information Technology ");
        else {
            System.out.println("Invalid input");
            System.exit(1);
        }

        char secondChar = input.charAt(1);
        if (secondChar == '1')
            System.out.println("Freshman");
        else if (secondChar == '2')
            System.out.println("Sophomore");
        else if (secondChar == '3')
            System.out.println("Junior");
        else if (secondChar == '4')
            System.out.println("Senior");
        else {
            System.out.println("Invalid input");
            System.exit(2);
        }
    }
}
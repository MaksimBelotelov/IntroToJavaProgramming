package org.example.ch5;

import java.util.Scanner;

/*
(Reverse a string) Write a program that prompts the user to enter a string and
displays the string in reverse order.
 */
public class Ex5_46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string to reverse: ");
        String inputString = scanner.nextLine();
        String result = "";
        for (int i = inputString.length() - 1; i >= 0; i--)
            result += inputString.charAt(i);
        System.out.println(result);
    }
}

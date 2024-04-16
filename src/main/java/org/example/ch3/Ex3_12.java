package org.example.ch3;

import java.util.Scanner;

/*
    (Palindrome integer) Write a program that prompts the user to enter a three-digit
    integer and determines whether it is a palindrome integer. An integer is palindrome
    if it reads the same from right to left and from left to right. A negative integer is
    treated the same as a positive integer.
 */
public class Ex3_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int integer = scanner.nextInt();
        if (integer / 100 == integer % 10)
            System.out.println(integer + " is a palindrome");
        else System.out.println(integer + " is not a palindrome");
    }
}

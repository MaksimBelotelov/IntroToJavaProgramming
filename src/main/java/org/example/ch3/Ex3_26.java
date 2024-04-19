package org.example.ch3;

/*
    (Use the &&, ||, and ^ operators) Write a program that prompts the user to
    enter an integer and determines whether it is divisible by 5 and 6, whether it is
    divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both.
 */

import java.util.Scanner;

public class Ex3_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();
        System.out.println("Is " + integer + " divisible by 5 and 6? " + (integer % 5 == 0 && integer % 6 == 0));
        System.out.println("Is " + integer + " divisible by 5 or 6? " + (integer % 5 == 0 || integer % 6 == 0));
        System.out.println("Is " + integer + " divisible by 5 or 6, but not both? "
                + (integer % 5 == 0 ^ integer % 6 == 0));
    }
}

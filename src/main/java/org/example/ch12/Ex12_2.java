package org.example.ch12;

/*
(InputMismatchException) Write a program that prompts the user to read
two integers and displays their sum. Your program should prompt the user to
read the number again if the input is incorrect.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex12_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;

        while (true) {
            try {
                System.out.print("Enter an integer1: ");
                num1 = scanner.nextInt();

                System.out.print("Enter an integer2: ");
                num2 = scanner.nextInt();

                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            }
            catch (InputMismatchException ex) {
                System.out.println("Incorrect input: an integer is required. Try again");
                scanner.nextLine();
            }
        }
    }
}

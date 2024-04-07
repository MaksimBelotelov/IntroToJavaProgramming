package org.example.ch2;

/*
    (Sum the digits in an integer) Write a program that reads an integer between 0
    and 1000 and adds all the digits in the integer. For example, if an integer is 932,
    the sum of all its digits is 14.
*/

import java.util.Scanner;

public class Ex2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();
        int res = 0;

        while (number > 0) {
            res += number % 10;
            number /= 10;
        }
        System.out.println("The sum of digits is " + res);
    }
}

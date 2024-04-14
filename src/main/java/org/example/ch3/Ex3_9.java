package org.example.ch3;

import java.util.Scanner;

/*
    (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
    consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
    which is calculated from the other 9 digits using the following formula:
    (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
    d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9),11
    If the checksum is 10, the last digit is denoted as X according to the ISBN-10
    convention. Write a program that prompts the user to enter the first 9 digits and
    displays the 10-digit ISBN (including leading zeros). Your program should read
    the input as an integer. Here are sample runs:
 */
public class Ex3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of the ISBN: ");
        int firstNineDigits = scanner.nextInt();

        int checksum = 0;
        int remainingDigits = firstNineDigits;
        for (int i = 9; i >= 1; i--) {
            int digit = remainingDigits % 10;
            checksum += i * digit;
            remainingDigits /= 10;
        }

        checksum %= 11;

        System.out.print("The 10-digit ISBN number is: ");
        System.out.printf("%09d", firstNineDigits);
        if(checksum == 10) System.out.print("X");
        else System.out.print(checksum);
    }
}

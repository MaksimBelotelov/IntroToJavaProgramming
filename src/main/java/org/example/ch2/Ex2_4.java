package org.example.ch2;

import java.util.Scanner;

/*
    (Convert pounds into kilograms) Write a program that converts pounds into ki-
    lograms. The program prompts the user to enter a number in pounds, converts it
    to kilograms, and displays the result. One pound is 0.454 kilogram. Here is a
    sample run:
 */
public class Ex2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double pounds = scanner.nextDouble();
        double kilograms = pounds * 0.454;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}

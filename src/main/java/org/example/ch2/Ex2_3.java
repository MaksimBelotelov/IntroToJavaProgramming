package org.example.ch2;


import java.util.Scanner;

/*
    (Convert feet into meters) Write a program that reads a number in feet, converts it
    to meters, and displays the result. One foot is 0.305 meter.
 */
public class Ex2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = scanner.nextDouble();
        double meters = feet * 0.305;
        System.out.println(feet + " feet is " + meters);
    }
}

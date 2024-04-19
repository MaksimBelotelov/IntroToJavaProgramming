package org.example.ch3;

/*
    (Compute the perimeter of a triangle) Write a program that reads three edges for
    a triangle and computes the perimeter if the input is valid. Otherwise, display
    that the input is invalid. The input is valid if the sum of every pair of two edges is
    greater than the remaining edge.
 */

import java.util.Scanner;

public class Ex3_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three edges lengths separated by space: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b > c && b + c > a && c + a > b)
            System.out.println("The perimeter of triangle is: " + (a + b + c));
        else
            System.out.println("Invalid input.\nSum of every pair of two edges should be greater than the remaining");
    }
}

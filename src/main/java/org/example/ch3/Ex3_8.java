package org.example.ch3;

import java.util.Scanner;

/*
    (Sort three integers) Write a program that prompts the user to enter three integers
    and display the integers in non-decreasing order.
 */
public class Ex3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a <= b && a <= c) {
            System.out.print(a + " ");
            if (b <= c) System.out.print(b + " " + c);
            else System.out.print(c + " " + b);
        }
        else if (b <= a && b <= c) {
            System.out.print(b + " ");
            if (a <= c) System.out.print(a + " " + c);
            else System.out.print(c + " " + a);
        }
        else {
            System.out.print(c + " ");
            if (a <= b) System.out.print(a + " " + b);
            else System.out.print(b + " " + a);
        }
    }
}

package org.example.ch5;

/*
(Find the factors of an integer) Write a program that reads an integer and displays
all its smallest factors in an increasing order. For example, if the input integer is
120, the output should be as follows: 2, 2, 2, 3, 5.
 */

import java.util.Scanner;

public class Ex5_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input any integer: ");
        int integer = scanner.nextInt();
        for (int d = 2; d <= integer; d++) {
            while (integer % d == 0) {
                System.out.print(d + " ");
                integer /= d;
            }
        }
    }
}

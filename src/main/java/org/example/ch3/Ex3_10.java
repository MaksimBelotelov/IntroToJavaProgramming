package org.example.ch3;

/*

 */

import java.util.Scanner;

public class Ex3_10 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        System.out.print(number1 + " + " + number2 + " = ");
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        System.out.println((number1 + number2) == result);
    }
}

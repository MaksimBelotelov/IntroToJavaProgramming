package org.example.ch7;

import java.util.Arrays;
import java.util.Scanner;

/*
(Reverse the numbers entered) Write a program that reads 10 integers then dis-
plays them in the reverse of the order in which they were read.
 */
public class Ex7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 integers:");
        int[] input = new int[10];
        for (int i = 0; i < 10; i++)
            input[i] = scanner.nextInt();

        System.out.println("Input array: " + Arrays.toString(input));
        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }

        System.out.println("After reverse: " + Arrays.toString(input));
    }
}

package org.example.ch7;

/*
(Print distinct numbers) Write a program that reads in 10 numbers and displays the
number of distinct numbers and the distinct numbers in their input order and sepa-
rated by exactly one space (i.e., if a number appears multiple times, it is displayed
only once). (Hint: Read a number and store it to an array if it is new. If the number is
already in the array, ignore it.) After the input, the array contains the distinct numbers.
 */

import java.util.Scanner;

public class Ex7_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int counter = 0;
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            if (contains(numbers, num) == -1)
                numbers[counter++] = num;
        }
        System.out.println("The number of distinct numbers: " + counter);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < counter; i++)
            System.out.print(numbers[i] + " ");
    }

    public static int contains(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }
}

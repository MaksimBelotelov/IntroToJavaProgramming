package org.example.ch7;

/*
(Reverse an array) The reverse method in Section 7.7 reverses an array by
copying it to a new array. Rewrite the method that reverses the array passed in
the argument and returns this array. Write a test program that prompts the user to
enter 10 numbers, invokes the method to reverse the numbers, and displays the
numbers.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[10];

        for (int i = 0; i < input.length; i++)
            input[i] = scanner.nextInt();

        System.out.println(Arrays.toString(reverse(input)));
    }

    public static int[] reverse(int[] list) {
        for (int i = 0, j = list.length - 1; i < j; i++, j--) {
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
        return list;
    }
}

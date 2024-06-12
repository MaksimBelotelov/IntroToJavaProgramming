package org.example.ch12;

/*
(ArrayIndexOutOfBoundsException) Write a program that meets the
following requirements:
■■ Creates an array with 100 randomly chosen integers.
■■ Prompts the user to enter the index of the array, then displays the corre-
sponding element value. If the specified index is out of bounds, display the
message "Out of Bounds".
 */

import java.util.Scanner;

public class Ex12_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[100];
        for (int i = 0; i < 100; i++)
            integers[i] = (int)(Math.random() * 100);

        System.out.print("Enter index: ");
        int index = scanner.nextInt();

        try {
            System.out.printf("value of integers[%d] is %d", index, integers[index]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }
    }
}

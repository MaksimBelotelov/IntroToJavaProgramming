package org.example.ch19;

/*
(Maximum element in an array) Implement the following method that returns the
maximum element in an array:

public static <E extends Comparable<E>> E max(E[] list)

Write a test program that prompts the user to enter 10 integers, invokes this method
to find the max, and displays the maximum number.
*/

import java.util.Scanner;

public class Ex19_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        Integer[] input = new Integer[10];

        for (int i = 0; i < 10; i++)
            input[i] = scanner.nextInt();

        System.out.println(max(input));
    }

    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];

        for (E item : list)
            if (item.compareTo(max) > 0)
                max = item;

        return max;
    }
}

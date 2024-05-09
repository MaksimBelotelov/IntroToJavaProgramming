package org.example.ch7;

import java.util.Arrays;
import java.util.Scanner;

/*
(Sorted?) Write the following method that returns true if the list is already sorted
in nondecreasing order:

public static boolean isSorted(int[] list)

Write a test program that prompts the user to enter a list and displays whether the
list is sorted or not. Here is a sample run. Note that the program first prompts the
user to enter the size of the list.
 */
public class Ex7_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the contents of the list: ");
        for (int i = 0; i < size; i++)
            arr[i] = scanner.nextInt();

        System.out.printf("The list has %d integers ", size);
        System.out.println(Arrays.toString(arr));
        if(isSorted(arr))
            System.out.println("The list is already sorted");
        else
            System.out.println("The list is not sorted");
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j])
                    return false;
            }
        }
        return true;
    }
}

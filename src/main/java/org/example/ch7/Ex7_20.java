package org.example.ch7;

import java.util.Arrays;
import java.util.Scanner;

/*
In Listing 7.8, you used selection sort to sort an array. The
selection-sort method repeatedly finds the smallest number in the current array
and swaps it with the first. Rewrite this program by finding the largest number and
swapping it with the last. Write a test program that reads in 10 double numbers,
invokes the method, and displays the sorted numbers.
 */
public class Ex7_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] testArray = new int[size];
        System.out.print("Enter elements: ");
        for (int i = 0; i < size; i++)
            testArray[i] = scanner.nextInt();

        reverseSelectionSort(testArray);
        System.out.println(Arrays.toString(testArray));
    }

    public static void reverseSelectionSort(int[] arr) {
        for(int i = arr.length - 1; i >= 0; i--) {
            int max = arr[i];
            int maxIndex = i;
            for (int j = 0; j < i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            arr[maxIndex] = arr[i];
            arr[i] = max;
        }
    }
}

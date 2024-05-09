package org.example.ch7;

import java.util.Arrays;

/*
(Execution time) Write a program that randomly generates an array of 100,000
integers and a key. Estimate the execution time of invoking the linearSearch
method in Listing 7.6. Sort the array and estimate the execution time of invoking
the binarySearch method in Listing 7.7. You can use the following code tem-
plate to obtain the execution time:
long startTime = System.nanoTime();
perform the task;
long endTime = System.nanoTime();
long executionTime = endTime − startTime;
 */
public class Ex7_16 {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++)
            arr[i] = (int)(Math.random() * 100000);
        int key = (int)(Math.random() * 100000);

        long startTime = System.nanoTime();
        linearSearch(arr, key);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Time of linear search: " + executionTime);

        Arrays.sort(arr);

        startTime = System.nanoTime();
        binarySearch(arr, key);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Time of binary search: " + executionTime);
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }
}
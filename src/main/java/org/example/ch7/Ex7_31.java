package org.example.ch7;

/*
(Merge two sorted lists) Write the following method that merges two sorted lists
into a new sorted list:

public static int[] merge(int[] list1, int[] list2)

Implement the method in a way that takes at most list1.length + list2.
l e n g t h comparisons. See liveexample.pearsoncmg.com/dsanimation/
MergeSortNeweBook.html for an animation of the implementation. Write a test
program that prompts the user to enter two sorted lists and displays the merged
list. Here is a sample run. Note the first number in the input indicates the number
of the elements in the list. This number is not part of the list.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int sizeOfList1 = scanner.nextInt();
        int[] list1 = new int[sizeOfList1];
        for(int i = 0; i < sizeOfList1; i++)
            list1[i] = scanner.nextInt();

        System.out.print("Enter list2 size and contents: ");
        int sizeOfList2 = scanner.nextInt();
        int[] list2 = new int[sizeOfList2];
        for(int i = 0; i < sizeOfList2; i++)
            list2[i] = scanner.nextInt();

        System.out.println("list1 is " + Arrays.toString(list1));
        System.out.println("list2 is " + Arrays.toString(list2));
        System.out.println("The merged list is " + Arrays.toString(merge(list1, list2)));
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] result = new int[list1.length + list2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < list1.length && j < list2.length) {
            if (list1[i] <= list2[j]) result[k++] = list1[i++];
            else result[k++] = list2[j++];
        }
        while (i < list1.length) result[k++] = list1[i++];
        while (j < list2.length) result[k++] = list1[j++];

        return result;
    }
}
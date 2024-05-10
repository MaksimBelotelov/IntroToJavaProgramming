package org.example.ch7;

/*
(Partition of a list) Write the following method that partitions the list using the
first element, called a pivot:

public static int partition(int[] list)

After the partition, the elements in the list are rearranged so all the elements before
the pivot are less than or equal to the pivot, and the elements after the pivot are
greater than the pivot. The method returns the index where the pivot is located in
the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition,
the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes at
most list.length comparisons. See liveexample.pearsoncmg.com/dsanima-
tion/QuickSortNeweBook.html for an animation of the implementation. Write a
test program that prompts the user to enter the size of the list and the contents of
the list and displays the list after the partition. Here is a sample run.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int sizeOfList = scanner.nextInt();
        int[] list = new int[sizeOfList];
        System.out.println("Enter list content:");
        for (int i = 0; i < sizeOfList; i++)
            list[i] = scanner.nextInt();

        partition(list);

        System.out.println("After the partition: " + Arrays.toString(list));
    }

    public static int partition(int[] list) {
        int left = 1;
        int right = list.length - 1;
        int pivot = list[0];

        while (left < right) {
            while (list[left] < pivot) left++;
            while (list[right] > pivot) right--;
            if (left <= right) {
                int temp = list[left];
                list[left] = list[right];
                list[right] = temp;
                left++;
                right--;
            }
        }

        while (list[right] >= pivot && right > 0)
            right--;

        if (list[right] < pivot) {
            list[0] = list[right];
            list[right] = pivot;
            return right;
        }
        return 0;
    }
}
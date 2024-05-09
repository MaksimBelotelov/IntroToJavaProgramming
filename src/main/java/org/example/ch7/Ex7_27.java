package org.example.ch7;

import java.util.Arrays;
import java.util.Scanner;

/*
(Identical arrays) The arrays list1 and list2 are identical if they have the same
contents. Write a method that returns true if list1 and list2 are identical,
using the following header:

public static boolean equals(int[] list1, int[] list2)

Write a test program that prompts the user to enter two lists of integers and dis-
plays whether the two are identical. Here are the sample runs. Note the first num-
ber in the input for each list indicates the number of the elements in the list. This
number is not part of the list.
 */
public class Ex7_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter list1 size and contents: ");
        int sizeOfList1 = scanner.nextInt();
        int[] list1 = new int[sizeOfList1];
        for (int i = 0; i < sizeOfList1; i++)
            list1[i] = scanner.nextInt();

        System.out.print("Enter list2 size and contents: ");
        int sizeOfList2 = scanner.nextInt();
        int[] list2 = new int[sizeOfList1];
        for (int i = 0; i < sizeOfList1; i++)
            list2[i] = scanner.nextInt();

        if (equals(list1, list2))
            System.out.println("Two lists are identical");
        else
            System.out.println("Two lists are not identical");
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length == list2.length) {
            Arrays.sort(list1);
            Arrays.sort(list2);
            for (int i = 0; i < list1.length; i++) {
                if (list1[i] != list2[i])
                    return false;
            }
            return true;
        }
        return false;
    }
}

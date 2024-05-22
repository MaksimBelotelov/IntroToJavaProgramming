package org.example.ch8;

import java.util.Arrays;
import java.util.Scanner;

/*
(Identical arrays) The two-dimensional arrays m1 and m2 are identical if they
have the same contents. Write a method that returns true if m1 and m2 are iden-
tical, using the following header:
public static boolean equals(int[][] m1, int[][] m2)
Write a test program that prompts the user to enter two 3 * 3 arrays of integers
and displays whether the two are identical.
 */
public class Ex8_29 {
    public static void main(String[] args) {
        int[][] list1 = new int[3][3];
        int[][] list2 = new int[3][3];

        System.out.print("Enter list1:");
        inputMatrix(list1);
        System.out.print("Enter list2:");
        inputMatrix(list2);

        if (equals(list1, list2))
            System.out.println("The two arrays are identical");
        else
            System.out.println("The two arrays are not identical");
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        int[] elements1 = new int[m1.length * m1[0].length];
        int[] elements2 = new int[m2.length * m2[0].length];

        int counter = 0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                elements1[counter] = m1[i][j];
                elements2[counter] = m2[i][j];
                counter++;
            }
        }

        Arrays.sort(elements1);
        Arrays.sort(elements2);

        for (int i = 0; i < m1.length; i++)
            if (elements1[i] != elements2[i])
                return false;

        return true;
    }

    public static void inputMatrix(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                matrix[i][j] = scanner.nextInt();
        }
    }
}

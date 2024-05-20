package org.example.ch8;

import java.util.Arrays;

/*
(Shuffle rows) Write a method that shuffles the rows in a two-dimensional int
array using the following header:

public static void shuffle(int[][] m)

Write a test program that shuffles the following matrix:
int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
*/

public class Ex8_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        System.out.println("Before: " + Arrays.deepToString(m));
        shuffle(m);
        System.out.println("After: " + Arrays.deepToString(m));
    }

    public static void shuffle(int[][] m) {
        for(int i = 0; i < m.length; i++) {
            int index = (int)(Math.random() * m.length);
            int[] temp = m[i];
            m[i] = m[index];
            m[index] = temp;
        }
    }
}

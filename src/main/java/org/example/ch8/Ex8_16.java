package org.example.ch8;

/*
(Sort two-dimensional array) Write a method to sort a two-dimensional array
using the following header:

public static void sort(int m[][])

The method performs a primary sort on rows, and a secondary sort on columns.
For example, the following array
{{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
will be sorted to
{{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}
 */

import java.util.Arrays;

public class Ex8_16 {
    public static void main(String[] args) {
        int[][] inputArray = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        sort(inputArray);
        System.out.println(Arrays.deepToString(inputArray));
    }

    public static void sort(int[][] m) {
        for (int i = 0; i < m.length - 1; i++) {
            int minVal = m[i][0];
            int minIndex = i;
            for (int j = i + 1; j < m.length; j++) {
                if (m[j][0] < minVal) {
                    minVal = m[j][0];
                    minIndex = j;
                }
            }
            int[] temp = m[minIndex];
            m[minIndex] = m[i];
            m[i] = temp;
        }

        for(int i = 0; i < m.length - 1; i++) {
            int minVal = m[i][1];
            int minIndex = i;
            for (int j = i + 1; j < m.length; j++) {
                if (m[j][0] != m[i][0]) break;
                if (m[j][1] < minVal) {
                    minVal = m[j][1];
                    minIndex = j;
                }
            }
            int[] temp = m[minIndex];
            m[minIndex] = m[i];
            m[i] = temp;
        }
    }
}

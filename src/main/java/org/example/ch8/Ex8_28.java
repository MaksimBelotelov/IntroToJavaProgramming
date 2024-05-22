package org.example.ch8;

/*
(Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
identical if their corresponding elements are equal. Write a method that returns
true if m1 and m2 are strictly identical, using the following header:
public static boolean equals(int[][] m1, int[][] m2)
Write a test program that prompts the user to enter two 3 * 3 arrays of integers
and displays whether the two are strictly identical.
 */

public class Ex8_28 {
    public static void main(String[] args) {
        int[][] list1 = {
                {51, 25, 22},
                {6, 1, 4},
                {24, 54, 6}
        };

        int[][] list2 = {
                {51, 22, 25},
                {6, 1, 4},
                {24, 54, 6}
        };

        if (equals(list1, list2))
            System.out.println("The two arrays are strictly identical");
        else
            System.out.println("The two arrays are not strictly identical");
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++)
                if (m1[i][j] != m2[i][j]) return false;
        }
        return true;
    }
}

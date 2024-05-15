package org.example.ch8;

/*
(Compute the weekly hours for each employee) Suppose the weekly hours for all
employees are stored in a two-dimensional array. Each row records an employ-
ee’s seven-day work hours with seven columns. For example, the following array
stores the work hours for eight employees. Write a program that displays employ-
ees and their total hours in decreasing order of the total hours.
*/

public class Ex8_4 {
    public static void main(String[] args) {
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        int[] totals = new int[hours.length];
        int[] indexes = new int[hours.length];

        for (int i = 0; i < hours.length; i++)
            indexes[i] = i;

        for (int i = 0; i < hours.length; i++) {
            for (int j = 0; j <hours[i].length; j++) {
                totals[i] += hours[i][j];
            }
        }

        for (int i = 0; i < totals.length; i++) {
            int max = totals[i];
            int maxIndex = i;
            for (int j = i + 1; j < totals.length; j++) {
                if (totals[j] > max) {
                    max = totals[j];
                    maxIndex = j;
                }
            }
            totals[maxIndex] = totals[i];
            totals[i] = max;
            int temp = indexes[i];
            indexes[i] = indexes[maxIndex];
            indexes[maxIndex] = temp;
        }

        for (int i = 0; i < totals.length; i++) {
            System.out.printf("Employee %d : %d hours\n", indexes[i], totals[i]);
        }
    }
}

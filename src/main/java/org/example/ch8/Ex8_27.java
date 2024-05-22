package org.example.ch8;

import java.util.Arrays;

/*

 */
public class Ex8_27 {
    public static void main(String[] args) {
        double[][] inputArray = {
                {0.15, 0.875, 0.375},
                {0.55, 0.005, 0.225},
                {0.3, 0.12, 0.4}
        };

        System.out.println("The column-sorted array is");
        double[][] res = sortColumns(inputArray);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }
    }

    public static double[][] sortColumns(double[][] m) {
        double[][] result = new double[m.length][m[0].length];
        double[] currentColumn = new double[m.length];
        for (int j = 0; j < m[0].length; j++) {
            for (int i = 0; i < m.length; i++)
                currentColumn[i] = m[i][j];

            Arrays.sort(currentColumn);

            for (int i = 0; i < m.length; i++)
                result[i][j] = currentColumn[i];
        }
        return result;
    }
}

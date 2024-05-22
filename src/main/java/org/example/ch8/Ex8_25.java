package org.example.ch8;

/*
(Markov matrix) An n * n matrix is called a positive Markov matrix if each
element is positive and the sum of the elements in each column is 1. Write the
following method to check whether a matrix is a Markov matrix:
public static boolean isMarkovMatrix(double[][] m)
Write a test program that prompts the user to enter a 3 * 3 matrix of double
values and tests whether it is a Markov matrix.
 */
public class Ex8_25 {
    public static void main(String[] args) {
        double[][] inputMatrix = {{0.95, -0.875, 0.375},
                                  {0.65, 0.005, 0.225},
                                  {0.30, 0.22, -0.4}
        };

        if (isMarkovMatrix(inputMatrix))
            System.out.println("It is a Markov matrix");
        else
            System.out.println("It is not Markov matrix");
    }

    public static boolean isMarkovMatrix(double[][] m) {
        for (int j = 0; j < m[0].length; j++) {
            double sum = 0;
            for (int i = 0; i < m.length; i++) {
                sum += m[i][j];
            }
            if (sum != 1) return false;
        }
        return true;
    }
}

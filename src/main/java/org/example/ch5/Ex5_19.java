package org.example.ch5;

/*
(Display numbers in a pyramid pattern) Write a nested for loop that prints the
following output:
             1
         1   2  1
      1  2   4  2  1
   1  2  4   8  4  2  1
1  2  4  8  16  8  4  2  1

 */

public class Ex5_19 {
    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++) {
            for (int j = 7 - i; j >= 0; j--) {
                System.out.print("    ");
            }

            for (int j = 1; j < Math.pow(2, i); j *= 2) {
                System.out.printf("%3d ", j);
            }

            for (int j = (int)Math.pow(2, i); j >= 1; j /= 2) {
                System.out.printf("%3d ", j);
            }

            System.out.println();
        }
    }
}

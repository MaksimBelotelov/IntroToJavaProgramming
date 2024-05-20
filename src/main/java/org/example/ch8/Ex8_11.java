package org.example.ch8;

import java.util.Scanner;

/*

 */
public class Ex8_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int number = scanner.nextInt();
        String num = Integer.toBinaryString(number);
        while (num.length() < 9)
            num = "0" + num;
        int pointer = 0;
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = num.charAt(pointer++) - '0';
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++)
                System.out.print(matrix[i][j] == 0 ? "H " : "T ");
        }
    }
}

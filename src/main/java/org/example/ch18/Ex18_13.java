package org.example.ch18;

import java.util.Scanner;

public class Ex18_13 {
    public static void main(String[] args) {
        final int SIZE = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers: ");
        int[] input = new int[SIZE];
        for (int i = 0; i < SIZE; i++)
            input[i] = scanner.nextInt();

        System.out.println("Max number is " + max(input));
    }

    public static int max(int[] array) {
        return max(array,0, array[0]);
    }

    public static int max(int[] array, int index, int largest) {
        if (index == array.length)
            return largest;
        else {
            if (array[index] > largest)
                largest = array[index];

            return max(array, index + 1, largest);
        }
    }
}

package org.example.ch7;

import java.util.Arrays;
import java.util.Scanner;

/*

 */
public class Ex7_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = {2, 3, 1, 5, 2, 4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] >= arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

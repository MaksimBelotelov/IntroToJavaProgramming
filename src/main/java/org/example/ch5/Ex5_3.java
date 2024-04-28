package org.example.ch5;

/*
    (Conversion from kilograms to pounds) Write a program that displays
    the following table (note 1 kilogram is 2.2 pounds)
 */

import java.util.Scanner;

public class Ex5_3 {
    public static void main(String[] args) {
        System.out.printf("%-12s%5s", "Kilograms", "Pounds\n");
        for (int i = 1; i < 200; i++)
            System.out.printf("%-12d%5.1f\n", i, i * 2.2);
    }
}

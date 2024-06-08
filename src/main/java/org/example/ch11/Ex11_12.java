package org.example.ch11;

/*
(Sum ArrayList) Write the following method that returns the sum of all numbers in an ArrayList:

public static double sum(ArrayList<Double> list)

Write a test program that prompts the user to enter five numbers, stores them in
an array list, and displays their sum.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        System.out.print("Enter five double numbers: ");
        for (int i = 0; i < 5; i++)
            list.add(scanner.nextDouble());

        System.out.println(sum(list));
    }

    public static double sum(ArrayList<Double> list) {
        double res = 0;

        for(Double item : list)
            res += item;

        return res;
    }
}

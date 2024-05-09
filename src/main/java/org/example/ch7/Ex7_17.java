package org.example.ch7;

import java.util.Arrays;
import java.util.Scanner;

/*
(Sort students) Write a program that prompts the user to enter the number of stu-
dents, the students’ names, and their scores and prints student names in decreasing
order of their scores. Assume the name is a string without spaces, use the Scan­
ner’s next() method to read a name.
 */
public class Ex7_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = scanner.nextInt();
        String[] names = new String[number];
        int[] scores = new int[number];
        System.out.print("Enter student's names and scores: ");
        for (int i = 0; i < number; i++) {
            names[i] = scanner.next();
            scores[i] = scanner.nextInt();
        }
        //sorting
        for (int i = 0; i < scores.length - 1; i++) {
            int min = scores[i];
            int minIndex = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < min) {
                    minIndex = j;
                    min = scores[j];
                }
            }
            scores[minIndex] = scores[i];
            scores[i] = min;
            String temp = names[i];
            names[i] = names[minIndex];
            names[minIndex] = temp;
        }

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i] + ":" + scores[i]);
        }
    }
}

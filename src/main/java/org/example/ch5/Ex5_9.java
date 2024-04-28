package org.example.ch5;

/*
(Find the two highest scores) Write a program that prompts the user to enter the
number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score. Use
the next() method in the Scanner class to read a name rather than using the
nextLine() method. Assume that the number of students is at least 2.
 */

import java.util.Scanner;

public class Ex5_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        String[] names = new String[numberOfStudents];
        int[] scores = new int[numberOfStudents];
        int maxIndex = 0;
        int secondMaxIndex = 0;
        int maxScores = 0;
        int secondMaxScores = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            names[i] = scanner.next();
            scores[i] = scanner.nextInt();
            if (scores[i] > maxScores) {
                secondMaxIndex = maxIndex;
                secondMaxScores = maxScores;
                maxScores = scores[i];
                maxIndex = i;
            }
            else if (scores[i] > secondMaxScores) {
                secondMaxIndex = i;
                secondMaxScores = scores[i];
            }
        }
        System.out.println(names[maxIndex] + " " + maxScores);
        System.out.println(names[secondMaxIndex] + " " + secondMaxScores);

    }
}

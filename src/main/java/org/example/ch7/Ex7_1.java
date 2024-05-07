package org.example.ch7;

import java.util.Scanner;

/*
(Assign grades) Write a program that reads student scores, gets the best score, and
then assigns grades based on the following scheme:
Grade is A if score is >= best -10;
Grade is B if score is >= best -20;
Grade is C if score is >= best -30;
Grade is D if score is >= best -40;
Grade is F otherwise.

The program prompts the user to enter the total number of students, then prompts
the user to enter all of the scores, and concludes by displaying the grades.
 */
public class Ex7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        int[] grades  = new int[numberOfStudents];

        System.out.print("Enter " + numberOfStudents + " scores: ");
        int best = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            grades[i] = scanner.nextInt();
            if (grades[i] > best) best = grades[i];
        }

        char grade = 'F';

        for (int i = 0; i < numberOfStudents; i++) {
            if (grades[i] >= best - 10) grade = 'A';
            else if (grades[i] >= best - 20) grade = 'B';
            else if (grades[i] >= best - 30) grade = 'C';
            else if (grades[i] >= best - 40) grade = 'D';
            else grade = 'F';

            System.out.printf("Student %d score is %d and grade is %c\n", i, grades[i], grade);
        }
    }
}
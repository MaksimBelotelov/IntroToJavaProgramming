package org.example.ch5;

/*
(Occurrence of max numbers) Write a program that reads integers, finds the larg-
est of them, and counts its occurrences. Assume the input ends with number 0.
Suppose you entered 3 5 2 5 5 5 0; the program finds that the largest is 5 and
the occurrence count for 5 is 4. If no input is entered, display "No numbers are
entered except 0".
 */

import java.util.Scanner;

public class Ex5_41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;
        int counter = 0;

        System.out.print("Enter numbers: ");
        while (true) {
            int number = scanner.nextInt();
            if(number > maxNumber) {
                maxNumber = number;
                counter = 1;
            }
            else if(number == 0)
                break;
            else if(number == maxNumber)
                counter++;
        }

        if (maxNumber == 0)
            System.out.println("No numbers are entered except 0");
        else {

            System.out.println("The largest number is: " + maxNumber);
            System.out.println("The occurrence count of the largest number is " + counter);
        }
    }
}

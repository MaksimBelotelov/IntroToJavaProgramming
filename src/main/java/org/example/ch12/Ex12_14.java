package org.example.ch12;

/*
(Process scores in a text file) Suppose a text file contains an unspecified
n umber of scores separated by spaces. Write a program that prompts the user to
enter the file, reads the scores from the file, and displays their total and average
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex12_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String name = scanner.nextLine();
        File file = new File(name);
        int sum = 0;
        int counter = 0;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNext()) {
                counter++;
                sum += fileScanner.nextInt();
            }
            System.out.println("Sum of scores: " + sum);
            System.out.println("Average score: " + (double)(sum) / counter);
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
}

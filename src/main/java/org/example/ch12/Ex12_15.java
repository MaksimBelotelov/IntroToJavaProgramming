package org.example.ch12;

/*
(Write/read data) Write a program to create a file named Exercise12_15.txt if
it does not exist. Write 100 integers created randomly into the file using text
I/O. Integers are separated by spaces in the file. Read the data back from the
file and display the data in increasing order.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Ex12_15 {
    public static void main(String[] args) {
        try (PrintWriter printWriter = new PrintWriter("Exercise12_15.txt")) {
            for (int i = 0; i < 100; i++)
                printWriter.print((int)(Math.random() * 100) + " ");
        }
        catch (FileNotFoundException ex) {
            System.out.println("Can't create file");
        }

        File file = new File("Exercise12_15.txt");
        int[] scores = new int[100];
        try (Scanner scanner = new Scanner(file)) {
            for (int i = 0; i < 100; i++)
                scores[i] = scanner.nextInt();
            Arrays.sort(scores);
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        System.out.println(Arrays.toString(scores));
    }
}

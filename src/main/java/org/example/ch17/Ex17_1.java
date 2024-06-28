package org.example.ch17;

/*
(Create a text file) Write a program to create a file named Exercise17_01.txt if
it does not exist. Append new data to it if it already exists. Write 100 integers
created randomly into the file using text I/O. Integers are separated by a space.
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Ex17_1 {
    public static void main(String[] args) {
        try (PrintWriter printWriter =
                new PrintWriter(new FileOutputStream("Exercise17_01.txt", true))) {

            for(int i = 0; i < 100; i++) {
                int number = (int)(Math.random() * 1000);
                printWriter.print(number + " ");
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

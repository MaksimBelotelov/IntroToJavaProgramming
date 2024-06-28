package org.example.ch17;

/*
(Frequency of characters) Write a program that prompts the user to enter the
name of an ASCII text file and displays the frequency of the characters in the file.
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex17_16 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of ASCII text file: ");
        String fileName = scanner.nextLine();
        int[] symbols = new int[128];

        try (FileInputStream fileInputStream =
                new FileInputStream(fileName)) {

            int value;
            while ((value = fileInputStream.read()) != -1)
                symbols[value]++;
        }

        for (int i = 0; i < 128; i++)
            if (symbols[i] > 0)
                System.out.println((char)(i) + " : " + symbols[i]);
    }
}
package org.example.ch17;

/*
(Encrypt files) Encode the file by adding 5 to every byte in the file. Write a program
that prompts the user to enter an input file name and an output file name and
saves the encrypted version of the input file to the output file.
*/

import java.io.*;
import java.util.Scanner;

public class Ex17_14 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input file name: ");
        String inputFileName = scanner.nextLine();
        System.out.print("Enter output file name: ");
        String outputFileName = scanner.nextLine();

        try (BufferedInputStream inputStream =
                     new BufferedInputStream(new FileInputStream(inputFileName));
             BufferedOutputStream outputStream =
                     new BufferedOutputStream(new FileOutputStream(outputFileName))) {

            int value;
            while ((value = inputStream.read()) != -1)
                outputStream.write(value + 5);
        }
    }
}
package org.example.ch17;

/*
(Convert a text file into UTF) Write a program that reads lines of characters from
a text file and writes each line as a UTF string into a binary file. Display the
sizes of the text file and the binary file. Use the following command to run the
program:

java Exercise17_04 input.txt output.utf
*/

import java.io.*;
import java.util.Scanner;

public class Ex17_4 {
    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            System.out.println("Error! Usage: java Exercise17_04 input.txt output.utf");
            System.exit(1);
        }

        File input = new File("input.txt");
        if (!input.exists()) {
            System.out.println("Error! Input file not found");
            System.exit(2);
        }

        try (Scanner scanner = new Scanner(input);
             DataOutputStream output = new DataOutputStream(new FileOutputStream("output.utf"))) {

            while (scanner.hasNext()) {
                String currentString = scanner.nextLine();
                output.writeUTF(currentString);
            }
        }

        try (InputStream textFile = new FileInputStream("input.txt");
            InputStream utfFile = new FileInputStream("output.utf")) {

            System.out.println("Size of text file is: " + textFile.available());
            System.out.println("Size of UTF file is: " + utfFile.available());
        }
    }
}
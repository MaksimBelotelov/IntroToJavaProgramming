package org.example.ch12;

/*
(Remove text) Write a program that removes all the occurrences of a specified
string from a text file. For example, invoking

java Exercise12_11 John filename

removes the string John from the specified file. Your program should get the
arguments from the command line.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_11 {
    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            System.out.println("Error! Usage: java Exercise12_11 John filename");
            System.exit(1);
        }

        String stringToRemove = args[0];
        File file = new File(args[1]);

        if (!file.exists()) {
            System.out.println("File not found");
            System.exit(2);
        }

        Scanner scanner = new Scanner(file);
        ArrayList<String> strings = new ArrayList<>();
        while (scanner.hasNext()) {
            String s1 = scanner.nextLine();
            strings.add(s1.replace(stringToRemove, ""));
        }

        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (String string : strings) {
                printWriter.println(string);
            }
        }
    }
}

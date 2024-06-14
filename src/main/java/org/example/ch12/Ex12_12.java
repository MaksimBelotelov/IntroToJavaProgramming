package org.example.ch12;

/*
(Reformat Java source code) Write a program that converts the Java source
code from the next-line brace style to the end-of-line brace style. For example,
the following Java source in (a) uses the next-line brace style. Your program
converts it to the end-of-line brace style in (b).
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_12 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Error! Usage: java Exercise12_12 Test.java");
            System.exit(1);
        }

        File file = new File(args[0]);
        ArrayList<String> strings = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            String previous = null;
            while (scanner.hasNext()) {
                String currentString = scanner.nextLine();
                String trimmedString = currentString.trim();
                if (!trimmedString.isBlank() && trimmedString.charAt(0) == '{') {
                    previous += " {";
                    continue;
                }
                if (previous != null) strings.add(previous);
                previous = currentString;
            }
            strings.add(previous);
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            System.exit(2);
        }

        try (PrintWriter printWriter = new PrintWriter(file)){
            for (String string : strings)
                printWriter.println(string);
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

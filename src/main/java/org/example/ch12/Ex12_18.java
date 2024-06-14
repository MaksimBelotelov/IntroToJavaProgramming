package org.example.ch12;

/*
(Add package statement) Suppose you have Java source files under the direc-
tories chapter1, chapter2, . . . , chapter34. Write a program to insert the
statement package chapteri; as the first line for each Java source file under
the directory chapteri. Suppose chapter1, chapter2, . . . , chapter34
 c
are under the root directory srcRootDirectory. The root directory and
chapteri directory may contain other folders and files. Use the following
command to run the program:

java Exercise12_18 srcRootDirectory

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_18 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Error! Usage: java Ex12_18 srcRootDirectory");
            System.exit(1);
        }

        File root = new File(args[0]);
        if (!root.exists() || !root.isDirectory()) {
            System.out.println("Directory error");
            System.exit(2);
        }

        File[] rootContent = root.listFiles();

        if (rootContent != null) {
            for (File current : rootContent) {
                if (current.isDirectory())
                    travers(current);
            }
        }
    }

    public static void travers(File dir) throws FileNotFoundException {
        File[] content = dir.listFiles();
        if (content != null) {
            String statement = "package " + dir.getName() + ";";

            for (File current : content) {
                if (current.isFile() && current.getName().matches(".*\\.java"))
                    writeStatementToFile(current, statement);
            }
        }
    }

    public static void writeStatementToFile(File file, String statement) throws FileNotFoundException {
        ArrayList<String> strings = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNext())
                strings.add(fileScanner.nextLine());
        }

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.println(statement);
            printWriter.println();

            for (String string : strings)
                printWriter.println(string);
        }
    }
}

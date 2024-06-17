package org.example.ch12;

/*
(Remove package statement) Suppose you have Java source files under the direc-
tories chapter1, chapter2, . . . , chapter34. Write a program to remove the
statement package chapteri; in the first line for each Java source file under
the directory chapteri. Suppose chapter1, chapter2, . . . , chapter34
are under the root directory srcRootDirectory. The root directory and
chapteri directory may contain other folders and files. Use the following
command to run the program:

java Exercise12_20 srcRootDirectory

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_20 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Error! Usage: java Exercise12_20 srcRootDirectory");
            System.exit(1);
        }

        File rootDir = new File(args[0]);
        if (!rootDir.exists() || !rootDir.isDirectory()) {
            System.out.println("Error! Root directory error");
            System.exit(2);
        }

        File[] rootDirContent = rootDir.listFiles();
        for (File current : rootDirContent) {
            if (current.isDirectory())
                travers(current);
        }
    }

    public static void travers(File dir) throws FileNotFoundException {
        File[] content = dir.listFiles();
        if (content != null) {
            for (File current : content)
                if (current.isFile() && current.getName().matches(".*\\.java"))
                    removeStatement(current);
        }
    }

    public static void removeStatement(File file) throws FileNotFoundException{
        try (Scanner scanner = new Scanner(file)) {
            String first = scanner.nextLine();
            ArrayList<String> strings = new ArrayList<>();
            if (!first.matches("package.*"))
                return;
            else {
                while (scanner.hasNext())
                    strings.add(scanner.nextLine());

                try (PrintWriter printWriter = new PrintWriter(file)) {
                    for (String string : strings)
                        printWriter.println(string);
                }
            }
        }
    }
}

package org.example.ch12;

/*
(Replace text) Revise Programming Exercise 12.16 to replace a string in a file with
a new string for all files in the specified directory using the following command:

java Exercise12_22 dir oldString newString
*/

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex12_22 {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("Error! Usage: java Ex12_22 dir oldStr newStr");
            System.exit(1);
        }

        File dir = new File(args[0]);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Directory " + args[0] + " does not exist or it isn't a directory");
            System.exit(2);
        }

        File[] dirContent = dir.listFiles();
        if (dirContent != null) {
            for (File currentFile : dirContent) {
                if (currentFile.isFile()) {
                    StringBuilder sb = new StringBuilder();

                    try (Scanner input = new Scanner(currentFile)) {
                        while (input.hasNext()) {
                            String currentString =
                                    input.nextLine().replaceAll(args[1], args[2]);
                            sb.append(currentString);
                            sb.append("\n");
                        }
                    }

                    try (PrintWriter printWriter = new PrintWriter(currentFile)) {
                        printWriter.println(sb);
                    }
                }
            }
        }
    }
}
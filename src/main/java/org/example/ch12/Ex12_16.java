package org.example.ch12;

/*
(Replace text) Listing 12.16, ReplaceText.java, gives a program that replaces
text in a source file and saves the change into a new file. Revise the program to
save the change into the original file. For example, invoking

java Exercise12_16 file oldString newString

replaces oldString in the source file with newString.
*/

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex12_16 {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("Error! Usage: java Ex12_16 file oldStr newStr");
            System.exit(1);
        }

        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }

        StringBuilder sb = new StringBuilder();

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String currentString =
                        input.nextLine().replaceAll(args[1], args[2]);
                sb.append(currentString);
                sb.append("\n");
            }
        }

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.println(sb);
        }
    }
}

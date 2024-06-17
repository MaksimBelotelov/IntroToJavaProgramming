package org.example.ch12;

/*
(Replace words) Suppose you have a lot of files in a directory that contain
words Exercisei_j, where i and j are digits. Write a program that pads a 0
before i if i is a single digit and 0 before j if j is a single digit. For example, the
word Exercise2_1 in a file will be replaced by Exercise02_01. In Java, when
you pass the symbol * from the command line, it refers to all files in the direc-
tory (see Supplement III.V). Use the following command to run your program:
java Exercise12_27 *
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex12_27 {
    public static void main(String[] args) throws FileNotFoundException {
        for (int i = 0; i < args.length; i++) {
            File file = new File(args[i]);
            StringBuilder sb = new StringBuilder();
            if (file.isFile()) {
                try (Scanner scanner = new Scanner(file)) {
                    while (scanner.hasNext()) {
                        String currentString = scanner.nextLine();
                        String[] words = currentString.split(" ");

                        for (int j = 0; j < words.length; j++) {
                            if (words[j].matches("Exercise[\\d]_.*")) {
                                words[j] = words[j].substring(0, words[j].indexOf('_') - 1) + "0" +
                                        words[j].substring(words[j].indexOf('_') - 1);
                            }

                            if (words[j].matches("Exercise.*_[\\d]")) {
                                words[j] = words[j].substring(0, words[j].indexOf('_') + 1) + "0" +
                                        words[j].substring(words[j].indexOf('_') + 1);
                            }
                            sb.append(words[j]);
                            sb.append(" ");
                        }
                        sb.append("\n");
                    }
                }
                try (PrintWriter printWriter = new PrintWriter(file)) {
                    printWriter.println(sb);
                }
            }
        }
    }
}

package org.example.ch12;

/*
(Rename files) Suppose you have several files in a directory named Exerci-
sei_j, where i and j are digits. Write a program that pads a 0 before j if j is a sin-
gle digit. For example, a file named Exercise2_1 in a directory will be renamed
to Exercise2_01. In Java, when you pass the symbol * from the command line,
it refers to all files in the directory (see Supplement III.V). Use the following
command to run your program:
java Exercise12_29 *
*/

import java.io.File;

public class Ex12_29 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            StringBuilder sb = new StringBuilder();
            if (args[i].matches("Exercise.*_[\\d].*")) {
                String oldName = args[i];
                sb.append(oldName,0, oldName.indexOf('_') + 1);
                sb.append("0");
                sb.append(oldName, oldName.indexOf('_') + 1, oldName.length());
            }
            File file = new File(args[i]);
            file.renameTo(new File(sb.toString()));
        }
    }
}

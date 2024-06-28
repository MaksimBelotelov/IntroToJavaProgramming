package org.example.ch17;

/*
(Combine files) Write a utility program that combines the files together into a
new file using the following command:

java Exercise17_12 SourceFile1 . . . SourceFilen TargetFile

The command combines SourceFile1, . . . , and SourceFilen into TargetFile.
*/

import java.io.*;

public class Ex17_12 {
    public static void main(String[] args) throws IOException {
        try (BufferedOutputStream outputStream =
                new BufferedOutputStream(new FileOutputStream(args[args.length - 1]))) {

            for (int i = 0; i < args.length; i++) {
                try (BufferedInputStream inputStream =
                        new BufferedInputStream(new FileInputStream(args[i]))) {
                    int value;
                    while ((value = inputStream.read()) != -1) {
                        outputStream.write(value);
                    }
                }
            }
        }
    }
}

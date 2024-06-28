package org.example.ch17;

/*
(Split files) Suppose you want to back up a huge file (e.g., a 10-GB AVI file) to a
CD-R. You can achieve it by splitting the file into smaller pieces and backing up
these pieces separately. Write a utility program that splits a large file into smaller
ones using the following command:
java Exercise17_10 SourceFile numberOfPieces
 */

import java.io.*;

public class Ex17_10 {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("usage: java Exercise17_10 SourceFile numberOfPieces");
            System.exit(1);
        }

        File inputFile = new File(args[0]);
        if (!inputFile.exists()) {
            System.out.println("No such file " + args[0]);
            System.exit(2);
        }

        try (BufferedInputStream inputStream =
                new BufferedInputStream(new FileInputStream(inputFile))) {

            int numberOfParts = Integer.parseInt(args[1]);
            int partSize = (int)(Math.ceil(inputStream.available() / (numberOfParts * 1.0)));

            for (int i = 1; i <= numberOfParts; i++) {
                try (BufferedOutputStream outputStream =
                             new BufferedOutputStream(new FileOutputStream(inputFile.getName() + "." + i))) {

                    int counter = 0;
                    int currentByte;

                    while (counter < partSize &&
                            (currentByte = inputStream.read()) != -1) {
                        outputStream.write(currentByte);
                        counter++;
                    }
                }
            }
        }
    }
}
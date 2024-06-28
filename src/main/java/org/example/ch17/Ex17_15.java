package org.example.ch17;

/*
(Decrypt files) Suppose a file is encrypted using the scheme in Programming
Exercise 17.14. Write a program to decode an encrypted file. Your program
should prompt the user to enter an input file name for the encrypted file and an
output file name for the unencrypted version of the input file.
*/

import java.io.*;
import java.util.Scanner;

public class Ex17_15 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter encrypted file name: ");
        String encryptedFileName = scanner.nextLine();
        System.out.print("Enter output file name: ");
        String outFileName = scanner.nextLine();

        try (BufferedInputStream bufferedInputStream =
                new BufferedInputStream(new FileInputStream(encryptedFileName));
             BufferedOutputStream bufferedOutputStream =
                new BufferedOutputStream(new FileOutputStream(outFileName))) {

            int value;
            while ((value = bufferedInputStream.read()) != -1)
                bufferedOutputStream.write(value - 5);
        }
    }
}

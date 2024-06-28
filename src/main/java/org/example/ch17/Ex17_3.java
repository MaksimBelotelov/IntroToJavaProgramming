package org.example.ch17;

/*
(Sum all the integers in a binary data file) Suppose a binary data file named
Exercise17_02.dat has been created from Programming Exercise 17.2 and its data
are created using writeInt(int) in DataOutputStream. The file contains an
unspecified number of integers. Write a program to find the sum of the integers.
*/

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex17_3 {
    public static void main(String[] args) {
        try (DataInputStream input =
                new DataInputStream(new FileInputStream("Exercise17_02.dat"))) {

            while (true) {
                System.out.println(input.readInt());
            }
        }
        catch (EOFException ex) {
            System.out.println("All data read");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

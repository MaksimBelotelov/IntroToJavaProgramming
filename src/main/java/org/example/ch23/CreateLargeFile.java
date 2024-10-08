package org.example.ch23;

import java.io.*;
import java.util.Arrays;

public class CreateLargeFile {
    public static void main(String[] args) throws Exception {
        DataOutputStream output = new DataOutputStream(
                new BufferedOutputStream(new FileOutputStream(
                        "largedata.dat")));

        for (int i = 0; i < 2_000_000; i++)
            output.writeInt((int)(Math.random() * 1000000));

        output.close();

        DataInputStream input = new DataInputStream(
                new BufferedInputStream(new FileInputStream("largedata.dat")));
        for (int i = 0; i < 100; i++)
            System.out.print(input.readInt() + " ");

        input.close();
    }



    // Copying First Half Segments


    // Merging All Segments


    // Merging two segments

}
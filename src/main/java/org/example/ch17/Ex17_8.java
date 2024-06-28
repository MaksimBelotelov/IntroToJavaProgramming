package org.example.ch17;

/*
(Update count) Suppose that you wish to track how many times a program has
been executed. You can store an int to count the file. Increase the count by 1
each time this program is executed. Let the program be Exercise17_08.txt and
store the count in Exercise17_08.dat.
 */

import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex17_8 {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile("Exercise17_08.dat", "rw")) {
            int counter = (raf.length() > 0) ? raf.readInt() : 0;
            counter++;
            raf.seek(0);
            raf.writeInt(counter);
            System.out.println(counter);
        }
    }
}

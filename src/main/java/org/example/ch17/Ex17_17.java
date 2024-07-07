package org.example.ch17;

/*
(BitOutputStream) Implement a class named BitOutputStream, as shown
in Figure 17.22, for writing bits to an output stream. The writeBit(char bit)
method stores the bit in a byte variable. When you create a BitOutputStream,
the byte is empty. After invoking writeBit('1'), the byte becomes 00000001.
After invoking writeBit("0101"), the byte becomes 00010101. The first
three bits are not filled yet. When a byte is full, it is sent to the output stream. Now
the byte is reset to empty. You must close the stream by invoking the close()
method. If the byte is neither empty nor full, the close() method first fills the
zeros to make a full 8 bits in the byte and then outputs the byte and closes the
stream. For a hint, see Programming Exercise 5.44. Write a test program that
sends the bits 010000100100001001101 to the file named Exercise17_17.dat.
*/

import java.io.*;

public class Ex17_17 {
    public static void main(String[] args) throws IOException{
        File file = new File("out.dat");
        BitOutputStream bis = new BitOutputStream(file);
        String input = "010000100100001001101";
        bis.writeBit(input);

        bis.close();
    }
}

class BitOutputStream {
    byte aByte;
    private DataOutputStream outputStream;
    private int counterOfBits;

    public BitOutputStream(File file) throws FileNotFoundException {
        outputStream = new DataOutputStream(new FileOutputStream(file));
    }

    public void writeBit(char bit) throws IOException {
        aByte = (byte)(aByte << 1 | (bit - '0'));
        counterOfBits++;

        if (counterOfBits == 8) {
            outputStream.writeByte(aByte);
            aByte = 0;
            counterOfBits = 0;
        }
    }

    public void writeBit(String bit) throws IOException {
        for (int i = 0; i < bit.length(); i++)
            writeBit(bit.charAt(i));
    }

    public void close() throws IOException {
        if (counterOfBits > 0) {
            aByte = (byte)(aByte << (8 - counterOfBits));
            outputStream.writeByte(aByte);
        }
        outputStream.close();
    }
}

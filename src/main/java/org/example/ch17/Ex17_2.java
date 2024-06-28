package org.example.ch17;

import java.io.*;

public class Ex17_2 {
    public static void main(String[] args) {

        try {
            try (DataOutputStream dataOutputStream =
                         new DataOutputStream(new FileOutputStream("Exercise17_02.dat", true))) {

                for (int i = 0; i < 100; i++) {
                    int number = (int) (Math.random() * 1000);
                    dataOutputStream.writeInt(number);
                }
            }

            try (DataInputStream dataInputStream =
                         new DataInputStream(new FileInputStream("Exercise17_02.dat"))) {

                while (true) {
                    System.out.println(dataInputStream.readInt());
                }
            }
        }
        catch (EOFException ex) {
            System.out.println("All data read");
        }
        catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

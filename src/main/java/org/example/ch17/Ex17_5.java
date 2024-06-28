package org.example.ch17;

/*
(Store objects and arrays in a file) Write a program that stores an array of the five
int values 1, 2, 3, 4, and 5, a Date object for the current time, and the double
value 5.5 into the file named Exercise17_05.dat. In the same program, write the
code to read and display the data.
*/

import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class Ex17_5 {
    public static void main(String[] args) throws IOException {
        int[] array = {1, 2, 3, 4, 5};
        Date date = new Date();
        double val = 5.5;

        try (ObjectOutputStream outputStream =
                new ObjectOutputStream(new FileOutputStream("Exercise17_05.dat"))) {

            outputStream.writeObject(array);
            outputStream.writeObject(date);
            outputStream.writeDouble(val);
        }

        try (ObjectInputStream inputStream =
                new ObjectInputStream(new FileInputStream("Exercise17_05.dat"))) {

            int[] newArray = (int[])(inputStream.readObject());
            Date newDate = (Date)(inputStream.readObject());
            double newVal = inputStream.readDouble();

            System.out.println(Arrays.toString(newArray) + " " + newDate + " " + newVal);
        }
        catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

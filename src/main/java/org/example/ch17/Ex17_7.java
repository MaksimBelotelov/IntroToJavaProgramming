package org.example.ch17;

/*
(Restore objects from a file) Suppose a file named Exercise17_06.dat has
been created using the ObjectOutputStream from the preceding program-
ming exercises. The file contains Loan objects. The Loan class in Listing 10.2
does not implement Serializable. Rewrite the Loan class to implement
Serializable. Write a program that reads the Loan objects from the file and
displays the total loan amount. Suppose that you don’t know how many Loan
objects are there in the file, use EOFException to end the loop.
*/

import java.io.*;

public class Ex17_7 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        try (ObjectInputStream inputStream =
                new ObjectInputStream(new FileInputStream("Exercise17_06.dat"))) {

            while (true) {
                Loan loan = (Loan)(inputStream.readObject());
                System.out.println(loan.getTotalPayment());
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

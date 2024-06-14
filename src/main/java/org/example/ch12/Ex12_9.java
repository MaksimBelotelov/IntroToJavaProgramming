package org.example.ch12;

/*
(BinaryFormatException) Exercise 12.7 implements the bin2Dec method
to throw a BinaryFormatException if the string is not a binary string. Define
a custom exception called BinaryFormatException . Implement the bin2Dec
method to throw a BinaryFormatException if the string is not a binary string.
*/

import java.util.Scanner;

public class Ex12_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        String binary = scanner.nextLine();

        try {
            System.out.println("Decimal: " + bin2Dec(binary));
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        int result = 0;
        int maxPow = binaryString.length() - 1;

        for (int i = 0; i < binaryString.length(); i++) {
            int current = binaryString.charAt(i) - '0';
            if (current < 0 || current > 1)
                throw new BinaryFormatException("Not a binary number");

            result += current * (int)(Math.pow(2, maxPow--));
        }

        return result;
    }
}

class BinaryFormatException extends Exception {
    public BinaryFormatException(String message) {
        super(message);
    }
}



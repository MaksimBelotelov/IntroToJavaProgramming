package org.example.ch12;

/*
(NumberFormatException) Write the bin2Dec(String binaryString)
method to convert a binary string into a decimal number. Implement the bin-
2Dec method to throw a NumberFormatException if the string is not a
binary string. Write a test program that prompts the user to enter a binary
number as a string and displays its decimal equivalent. If the method throws
an exception, display “Not a binary number”.
*/

import java.util.Scanner;

public class Ex12_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        String binary = scanner.nextLine();

        try {
            System.out.println("Decimal: " + bin2Dec(binary));
        }
        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int bin2Dec(String binaryString) throws NumberFormatException {
        int result = 0;
        int maxPow = binaryString.length() - 1;

        for (int i = 0; i < binaryString.length(); i++) {
            int current = binaryString.charAt(i) - '0';
            if (current < 0 || current > 1)
                throw new NumberFormatException("Not a binary number");

            result += current * (int)(Math.pow(2, maxPow--));
        }

        return result;
    }
}



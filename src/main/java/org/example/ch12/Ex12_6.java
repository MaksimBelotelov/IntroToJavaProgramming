package org.example.ch12;

/*
(NumberFormatException) Listing 6.8 implements the hex2Dec(String
hexString) method, which converts a hex string into a decimal number.
Implement the hex2Dec method to throw a NumberFormatException if the
string is not a hex string. Write a test program that prompts the user to enter
a hex number as a string and displays its decimal equivalent. If the method
throws an exception, display “Not a hex number”
 */

import java.util.Scanner;

public class Ex12_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        try {
            System.out.println("The decimal value for hex number "
                    + hex + " is " + hexToDecimal(hex.toUpperCase()));
        }
        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) throws NumberFormatException {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else if (ch >= '0' && ch <= '9')
            return ch - '0';
        else
            throw new NumberFormatException("Not a hex number");
    }
}

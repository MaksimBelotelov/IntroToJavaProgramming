package org.example.ch12;

/*
(HexFormatException) Programming Exercise 12.6 implements the hex2Dec method to throw a NumberFormatException
if the string is not a hex string. Define a custom exception called HexFormatException.
*/

import java.util.Scanner;

public class Ex12_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        try {
            System.out.println("The decimal value for hex number "
                    + hex + " is " + hexToDecimal(hex.toUpperCase()));
        }
        catch (HexFormatException ex) {
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

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else if (ch >= '0' && ch <= '9')
            return ch - '0';
        else
            throw new HexFormatException();
    }
}

class HexFormatException extends NumberFormatException {
    public HexFormatException() {
        super("Not a hex number");
    }
}
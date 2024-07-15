package org.example.ch18;

/*
(Hex to decimal) Write a recursive method that parses a hex number as a string
into a decimal integer. The method header is

public static int hex2Dec(String hexString)

Write a test program that prompts the user to enter a hex string and displays its
decimal equivalent.
*/

import java.util.Scanner;

public class Ex18_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hex string: ");
        String input = scanner.nextLine();
        System.out.println("Decimal: " + hex2Dec(input));
    }

    public static int hex2Dec(String binaryString) {
        return hex2Dec(binaryString, 0, 0);
    }

    public static int hex2Dec(String binaryString, int pow, int res) {
        if (pow == binaryString.length())
            return res;
        else {
            char current =
                    Character.toUpperCase(binaryString.charAt(binaryString.length() - 1 - pow));

            int result = 0;
            if (current >= '0' && current <= '9')
                result = current - '0';
            else
                result = current - 55;

            return (int)(res + result * Math.pow(16, pow)) +
                    hex2Dec(binaryString, pow + 1, res);
        }
    }
}

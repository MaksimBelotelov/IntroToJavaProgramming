package org.example.ch18;

/*
(Binary to decimal) Write a recursive method that parses a binary number as a
string into a decimal integer. The method header is:

public static int bin2Dec(String binaryString)

Write a test program that prompts the user to enter a binary string and displays
its decimal equivalent.
*/

import java.util.Scanner;

public class Ex18_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary string: ");
        String input = scanner.nextLine();
        System.out.println("Decimal: " + bin2Dec(input));
    }

    public static int bin2Dec(String binaryString) {
        return bin2Dec(binaryString, 0, 0);
    }

    public static int bin2Dec(String binaryString, int pow, int res) {
        if (pow == binaryString.length())
            return res;
        else {
            char current = binaryString.charAt(binaryString.length() - 1 - pow);

            return res + (int)((current - '0') * Math.pow(2, pow)) +
                    bin2Dec(binaryString, pow + 1, res);
        }
    }
}

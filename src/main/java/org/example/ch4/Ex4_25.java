package org.example.ch4;

/*
    (Generate vehicle plate numbers) Assume that a vehicle plate number consists
    of three uppercase letters followed by four digits. Write a program to generate a
    plate number.
 */

public class Ex4_25 {
    public static void main(String[] args) {
        String plateNumber = "";
        for(int i = 0; i < 3; i++) {
            int letterCode = 65 + (int)(Math.random() * 26);
            plateNumber += (char)(letterCode);
        }

        int digitsCode = (int)(Math.random() * 10000);
        String digits = String.format("%04d", digitsCode);
        plateNumber += digits;

        System.out.println("Generated number: " + plateNumber);
    }
}

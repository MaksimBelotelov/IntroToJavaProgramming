package org.example.ch17;

/*

*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex17_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        try (FileInputStream inputStream =
                new FileInputStream(fileName)) {

            int current;
            while ((current = inputStream.read()) != -1)
                System.out.print(getBits(current));
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String getBits(int value) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int n = value >> i;
            int currentBit = n & 1;
            result.append(currentBit);
        }

        return result.reverse().toString();
    }
}

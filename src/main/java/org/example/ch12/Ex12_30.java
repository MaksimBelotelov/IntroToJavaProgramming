package org.example.ch12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex12_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);
        try (Scanner fileScanner = new Scanner(file)) {
            int[] letterOccurs = new int[26];
            while (fileScanner.hasNext()) {
                String currentString = fileScanner.nextLine();
                for (int i = 0; i < currentString.length(); i++) {
                    char ch = currentString.charAt(i);
                    if (Character.isLetter(ch)) {
                        int symbolCode = Character.toUpperCase(currentString.charAt(i));
                        letterOccurs[symbolCode - 65]++;
                    }
                }
            }

            for (int i = 0; i < 26; i++)
                System.out.printf("Number of %c: %d\n", (char)(i + 65), letterOccurs[i]);
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
            System.out.println(ex.getMessage());
        }
    }
}

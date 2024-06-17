package org.example.ch12;

/*
(Create a directory) Write a program that prompts the user to enter a directory
name and creates a directory using the File’s mkdirs method. The program
displays the message “Directory created successfully” if a directory is created
or “Directory already exists” if the directory already exists.
*/

import java.io.File;
import java.util.Scanner;

public class Ex12_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any name for new directory: ");
        String name = scanner.nextLine();

        File file = new File(name);
        if (!file.exists() && file.mkdir())
            System.out.println("Directory created successfully");
        else
            System.out.println("Directory already exists");
    }
}

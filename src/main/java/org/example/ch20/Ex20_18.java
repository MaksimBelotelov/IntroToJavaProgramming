package org.example.ch20;

/*
(Directory size) Listing 18.7, DirectorySize.java, gives a recursive method for
finding a directory size. Rewrite this method without using recursion. Your
program should use a queue to store the subdirectories under a directory.
 */

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex20_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a directory: ");
        String dir = scanner.nextLine();
        System.out.println("Directory size: " + getSize(new File(dir)) + " bytes");
    }

    public static long getSize(File directory) {
        long size = 0;
        Queue<File> queue = new LinkedList<>();
        queue.add(directory);

        while (!queue.isEmpty()) {
            File t = queue.poll();
            if (t.isFile())
                size += t.length();
            else
                queue.addAll(Arrays.asList(t.listFiles()));
        }

        return size;
    }
}

package org.example.ch5;

/*
(Display the ASCII character table) Write a program that prints the characters in
the ASCII character table from ! to ~. Display 10 characters per line. The ASCII
table is given in Appendix B. Characters are separated by exactly one space.
 */

public class Ex5_15 {
    public static void main(String[] args) {
        int counter = 0;
        for (int code = 33; code < 127; code++) {
            System.out.print((char)(code) + ((++counter % 10 == 0) ? "\n" : " "));
        }
    }
}

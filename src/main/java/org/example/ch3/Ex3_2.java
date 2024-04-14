package org.example.ch3;

/*
    (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, gen-
    erates two integers and prompts the user to enter the sum of these two integers.
    Revise the program to generate three single-digit integers and prompt the user to
    enter the sum of these three integers.
 */


import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
        int c = (int)(Math.random() * 10);

        System.out.print(a + " + " + b + " + " + c + " = ");

        int expectedResult = a + b + c;

        Scanner scanner = new Scanner(System.in);
        int receivedResult = scanner.nextInt();
        System.out.println(expectedResult == receivedResult);
    }
}

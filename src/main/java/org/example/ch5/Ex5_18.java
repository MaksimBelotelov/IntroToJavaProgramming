package org.example.ch5;

/*
(Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:
 */

public class Ex5_18 {
    public static void main(String[] args) {
        System.out.println("Pattern A");
        for (int i = 0; i < 7; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }

        System.out.println("\nPattern B");
        for (int i = 7; i > 0; i--) {
            for (int j = 1; j < i; j++)
                System.out.print(j + " ");
            System.out.println();
        }

        System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < 6 - i; j++)
                System.out.print("  ");
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("Pattern D");
        for (int i = 6; i >= 1; i--) {
            for (int j = 6 - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");

            System.out.println();
        }
    }
}

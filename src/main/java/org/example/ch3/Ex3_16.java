package org.example.ch3;

/*
    (Random point) Write a program that displays a random coordinate in a rectangle.
    The rectangle is centered at (0, 0) with width 100 and height 200.
 */

public class Ex3_16 {
    public static void main(String[] args) {
            double x = -50 + Math.random() * 100;
            double y = -100 + Math.random() * 200;

            System.out.printf("(%.2f, %.2f) ", x, y);
    }
}

package org.example.ch3;

/*
    (Geometry: point position) Given a directed line from point p0(x0, y0) to p1(x1,
    y1), you can use the following condition to decide whether a point p2(x2, y2) is
    on the left of the line, on the right, or on the same line (see Figure 3.11):
    7 0 p2 is on the left side of the line
    ...
    Write a program that prompts the user to enter the three points for p0, p1, and p2
    and displays whether p2 is on the left of the line from p0 to p1, to the right, or on
    the same line.
*/

import java.util.Scanner;

public class Ex3_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, p2: ");
        double p0x = scanner.nextDouble();
        double p0y = scanner.nextDouble();
        double p1x = scanner.nextDouble();
        double p1y = scanner.nextDouble();
        double p2x = scanner.nextDouble();
        double p2y = scanner.nextDouble();

        double res = (p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y);

        if (res > 0)
            System.out.println("p2 is on the left side of the line");
        else if (res == 0)
            System.out.println("p2 is on the same line");
        else
            System.out.println("p2 is on the right side of the line");
    }
}

package org.example.ch6;

import java.util.Scanner;

/*
(Geometry: point position) Programming Exercise 3.32 shows how to test
whether a point is on the left side of a directed line, on the right, or on the same
line. Write the methods with the following headers:
/** Return true if point (x2, y2) is on the left side of the
* directed line from (x0, y0) to (x1, y1) */
//public static boolean leftOfTheLine(double x0, double y0,
//                                    double x1, double y1, double x2, double y2)
///** Return true if point (x2, y2) is on the same
// * line from (x0, y0) to (x1, y1) */
//public static boolean onTheSameLine(double x0, double y0,
//                                    double x1, double y1, double x2, double y2)
///** Return true if point (x2, y2) is on the
// * line segment from (x0, y0) to (x1, y1) */
//public static boolean onTheLineSegment(double x0, double y0,
//                                       double x1, double y1, double x2, double y2)
//
public class Ex6_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, p2: ");
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.printf("(%.2f, %.2f) is on the ", x2, y2);
        if (onTheLineSegment(x0, y0, x1, y1, x2, y2))
            System.out.printf("line segment from (%.2f, %.2f) to (%.2f, %.2f)", x0, y0, x1, y1);
        else if (onTheSameLine(x0, y0, x1, y1, x2, y2))
            System.out.printf("same line from (%.2f, %.2f) to (%.2f, %.2f)", x0, y0, x1, y1);
        else if (leftOfTheLine(x0, y0, x1, y1, x2, y2))
            System.out.printf("left side of the line from (%.2f, %.2f) to (%.2f, %.2f)", x0, y0, x1, y1);
    }

    public static boolean leftOfTheLine(double x0, double y0,
                                    double x1, double y1, double x2, double y2) {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0;
    }

    public static boolean onTheSameLine(double x0, double y0,
                                        double x1, double y1, double x2, double y2) {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
    }

    public static boolean onTheLineSegment(double x0, double y0,
                                           double x1, double y1, double x2, double y2) {
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0) &&
                ((x2 >= x0) && (x2 <= x1)) &&
                ((y2 >= y0) && (y2 <= y1));
    }
}
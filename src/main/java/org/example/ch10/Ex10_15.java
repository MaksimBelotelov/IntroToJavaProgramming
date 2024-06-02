package org.example.ch10;
/*
(Geometry: the bounding rectangle) A bounding rectangle is the minimum rect-
angle that encloses a set of points in a two-dimensional plane, as shown in
Figure 10.24d. Write a method that returns a bounding rectangle for a set of
points in a two-dimensional plane, as follows:

public static MyRectangle2D getRectangle(double[][] points)

The Rectangle2D class is defined in Programming Exercise 10.13. Write a test
program that prompts the user to enter five points and displays the bounding
rectangle’s center, width, and height.
 */
public class Ex10_15 {
    public static void main(String[] args) {
        double[][] points = {{7.0, 8.0},
                             {3.0, 4.0},
                             {5.0, 6.0},
                             {9.0, 10.0},
                             {1.0, 2.5},
        };

        MyRectangle2D rect = getRectangle(points);
        System.out.printf("The bounding rectangle's center (%.2f, %.2f), width: %.2f, height: %.2f",
                rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
    }

    public static MyRectangle2D getRectangle(double[][] points) {
        double minX = points[0][0];
        int minXIndex = 0;
        double maxX = points[0][0];
        int maxXIndex = 0;

        for (int i = 0; i < points.length; i++) {
            if (points[i][0] < minX) {
                minX = points[i][0];
                minXIndex = i;
            }
            if (points[i][0] > maxX) {
                maxX = points[i][0];
                maxXIndex = i;
            }
        }

        double minY = points[minXIndex][1];
        double maxY = points[maxXIndex][1];

        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == minX && points[i][1] < minY) minY = points[i][1];
            if (points[i][0] == maxX && points[i][1] > maxY) maxY = points[i][1];
        }

        double width = maxX - minX;
        double rectCenterX = (maxX + minX) / 2;
        double height = maxY - minY;
        double rectCenterY = (maxY + minY) / 2;

        return new MyRectangle2D(rectCenterX, rectCenterY, width, height);
    }
}
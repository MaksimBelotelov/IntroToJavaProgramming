package org.example.ch8;

import java.util.Scanner;

/*
(Points nearest to each other) Listing 8.3 gives a program that finds two points in
a two-dimensional space nearest to each other. Revise the program so it finds two
points in a three-dimensional space nearest to each other. Use a two-dimensional
array to represent the points.
 */
public class Ex8_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();
*/
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
        {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
        {5.5, 4, -0.5}};

        /*double[][] points = new double[numberOfPoints][3];
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
            points[i][2] = input.nextDouble();
        }*/

        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1], points[p1][2],
                points[p2][0], points[p2][1], points[p2][2]);

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1], points[i][2],
                        points[j][0], points[j][1], points[j][2]);
                if (distance < shortestDistance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }

        System.out.println("The closest two points are " +
                "(" + points[p1][0] + ", " + points[p1][1] + ", " +points[p1][2] +") and (" +
                points[p2][0] + ", " + points[p2][1] + ", " +points[p2][2] +")");
    }

    public static double distance(
            double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
    }
}

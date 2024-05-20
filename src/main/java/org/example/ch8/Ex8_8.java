package org.example.ch8;

import java.util.Scanner;

/*
(All closest pairs) Revise Listing 8.3, FindNearestPoints.java, to display
all closest pairs of points with the same minimum distance.
 */
public class Ex8_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of points: ");

        int numberOfPoints = input.nextInt();

        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1],
                points[p2][0], points[p2][1]);

        int[][] pairs = new int[points.length][2];
        int pairsCounter = 0;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]);
                if (shortestDistance > distance) {
                    pairsCounter = 0;
                    pairs[pairsCounter][0] = i;
                    pairs[pairsCounter][1] = j;
                    shortestDistance = distance;
                }
                else if (shortestDistance == distance) {
                    pairs[pairsCounter][0] = i;
                    pairs[pairsCounter][1] = j;
                    pairsCounter++;
                }
            }
        }

        for (int i = 0; i < pairsCounter; i++) {
            p1 = pairs[i][0];
            p2 = pairs[i][1];
            System.out.println("The closest two points are " +
                    "(" + points[p1][0] + ", " + points[p1][1] + ") and (" +
                    points[p2][0] + ", " + points[p2][1] + ")");
        }
        System.out.println("Their distance is " + shortestDistance);
    }

    public static double distance(
            double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}

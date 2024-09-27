package org.example.ch22;

/*
(Closest pair of points) Section 22.8 introduced an algorithm for finding the
closest pair of points using a divide-and-conquer approach. Implement the
algorithm to meet the following requirements:
■■ Define a class named Pair with the data fields p1 and p2 to represent
two points and a method named getDistance() that returns the distance
between the two points.
■■ Implement the following methods:

Return the distance of the closest pair of points:
public static Pair getClosestPair(double[][] points)

Return the distance of the closest pair of points:
public static Pair getClosestPair(Point2D[] points)

Return the distance of the closest pair of points
in pointsOrderedOnX[low..high]. This is a recursive
method. pointsOrderedOnX and pointsOrderedOnY are
not changed in the subsequent recursive calls.
public static Pair distance(Point2D[] pointsOrderedOnX,
                            int low, int high, Point2D[] pointsOrderedOnY)

///** Compute the distance between two points p1 and p2 */

//public static double distance(Point2D p1, Point2D p2)
///** Compute the distance between points (x1, y1) and (x2, y2) */
//public static double distance(double x1, double y1,
//                              double x2, double y2)


import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Comparator;

public class Ex22_7 {
    public static void main(String[] args) {
        double[][] points = {{0,0}, {1,1}, {4,4}, {4.5,4.5}, {8,8}};
        System.out.println(getClosestPair(points));
    }

    public static Pair getClosestPair(double[][] points) {
        Point2D[] pointArray = new Point2D[points.length];
        for (int i = 0; i < points.length; i++) {
            pointArray[i] = new Point2D.Double(points[i][0], points[i][1]);
        }
        return getClosestPair(pointArray);
    }

    public static Pair getClosestPair(Point2D[] points) {
        Arrays.sort(points, Comparator.comparingDouble(Point2D::getX)
                .thenComparingDouble(Point2D::getY));

        Point2D[] pointsOrderedOnY = new Point2D[points.length];
        System.arraycopy(points, 0, pointsOrderedOnY, 0, points.length);
        Arrays.sort(pointsOrderedOnY, Comparator.comparingDouble(Point2D::getY));
        return distance(points, 0, points.length - 1, pointsOrderedOnY);
    }

    public static Pair distance(Point2D[] pointsOrderedOnX, int low, int high, Point2D[] pointsOrderedOnY) {
        if (high - low <= 3) {
            return bruteForce(pointsOrderedOnX, low, high);
        }

        int midIndex = (low + high) / 2;
        Point2D middlePoint = pointsOrderedOnX[midIndex];

        Pair leftPair = distance(pointsOrderedOnX, low, midIndex, pointsOrderedOnY);
        Pair rightPair = distance(pointsOrderedOnX, midIndex + 1, high, pointsOrderedOnY);

        double leftDistance = leftPair.getDistance();
        double rightDistance = rightPair.getDistance();

        double minDistance = Math.min(leftDistance, rightDistance);
        Pair minPair = (minDistance == leftDistance) ? leftPair : rightPair;

        Point2D[] strip = new Point2D[high - low + 1];
        int j = 0;
        for (int i = low; i <= high; i++)
            if (Math.abs(pointsOrderedOnY[i].getX() - middlePoint.getX()) < minDistance)
                strip[j++] = pointsOrderedOnY[i];

        for (int i = 0; i < j; i++) {
            for (int k = i + 1; k < j &&
                    (strip[k].getY() - strip[i].getY()) < minDistance; k++) {
                double distance = Pair.distance(strip[i], strip[k]);
                if (distance < minDistance) {
                    minDistance = distance;
                    minPair = new Pair(strip[i], strip[k]);
                }
            }
        }

        return minPair;
    }

    private static Pair bruteForce(Point2D[] points, int low, int high) {
        double minDistance = Double.MAX_VALUE;
        Pair closestPair = null;

        for (int i = low; i <= high; i++) {
            for (int j = i + 1; j <= high; j++) {
                double distance = Pair.distance(points[i], points[j]);
                if (distance < minDistance) {
                    minDistance = distance;
                    closestPair = new Pair(points[i], points[j]);
                }
            }
        }

        return closestPair;
    }
}

class Pair {
    private Point2D p1;
    private Point2D p2;

    public Pair(Point2D p1, Point2D p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getDistance() {
        return distance(p1, p2);
    }

    public static double distance(Point2D p1, Point2D p2) {
        return p1.distance(p2);
    }

    public static double distance(double x1, double y1,
                                  double x2, double y2) {

        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    @Override
    public String toString() {
        return "Pair{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
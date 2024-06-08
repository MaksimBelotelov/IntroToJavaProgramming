package org.example.ch11;

/*
(Area of a convex polygon) A polygon is convex if it contains any line segments
that connects two points of the polygon. Write a program that prompts the user
to enter the number of points in a convex polygon, enter the points clockwise,
then displays the area of the polygon. For the formula for computing the area of
a polygon, see http://www.mathwords.com/a/area_convex_polygon.html.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = scanner.nextInt();
        ArrayList<Point> listOfPoints = new ArrayList<>();
        System.out.print("Enter the coordinates of the points: ");
        for (int i = 0; i < numberOfPoints; i++)
            listOfPoints.add(new Point(scanner.nextDouble(), scanner.nextDouble()));

        System.out.printf("The total area is %.2f", areaOfPolygon(listOfPoints));
    }

    public static double areaOfPolygon(ArrayList<Point> points) {
        double result = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            result += points.get(i).getX() * points.get(i + 1).getY() -
                    points.get(i).getY() * points.get(i + 1).getX();

        }

        result += points.get(points.size() - 1).getX() * points.get(0).getY() -
                points.get(points.size() - 1).getY() * points.get(0).getX();

        result /= 2;
        return Math.abs(result);
    }
}



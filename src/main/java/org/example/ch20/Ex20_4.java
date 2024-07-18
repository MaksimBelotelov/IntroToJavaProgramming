package org.example.ch20;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex20_4 {
    public static void main(String[] args) {
        final int NUMBER_OF_POINTS = 100;
        final double X_LENGTH = 100;
        final double Y_LENGTH = 100;

        List<Point2D> points = new ArrayList<>(NUMBER_OF_POINTS);

        for (int i = 0; i < NUMBER_OF_POINTS; i++) {
            Point2D point2D = new Point2D.Double(Math.round(Math.random() * X_LENGTH * 100) / 100.0,
                    Math.round(Math.random() * Y_LENGTH * 100) / 100.0);
            points.add(point2D);
        }

        points.sort(Comparator.comparing(Point2D::getY)
                .thenComparing(Point2D::getX));

        for (int i = 0; i < 5; i++)
            System.out.println(points.get(i));
    }
}

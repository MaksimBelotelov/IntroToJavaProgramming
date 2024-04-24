package org.example.ch4;

/*
    (Geography: estimate areas) Use the GPS locations for Atlanta, Georgia;
    Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina in the fig-
    ure in Section 4.1 to compute the estimated area enclosed by these four cities.
    (Hint: Use the formula in Programming Exercise 4.2 to compute the distance
    between two cities. Divide the polygon into two triangles and use the formula in
    Programming Exercise 2.19 to compute the area of a triangle.)
 */

public class Ex4_3 {
    public static void main(String[] args) {
        final double charlotteX = 35.2270869;
        final double charlotteY = -80.8431267;
        final double savannahX = 32.0835407;
        final double savannahY = -81.0998342;
        final double orlandoX = 28.5383355;
        final double orlandoY = -81.3792365;
        final double atlantaX = 33.7489954;
        final double atlantaY = -84.3879824;

        double charlotteSavannahDistance = computeDistanceByCoordinates(charlotteX, charlotteY,
                savannahX, savannahY);
        double savannahOrlandoDistance = computeDistanceByCoordinates(savannahX, savannahY,
                orlandoX, orlandoY);
        double orlandoAtlantaDistance = computeDistanceByCoordinates(orlandoX, orlandoY,
                atlantaX, atlantaY);
        double atlantaCharlotteDistance = computeDistanceByCoordinates(atlantaX, atlantaY,
                charlotteX, charlotteY);
        double charlotteOrlandoDistance = computeDistanceByCoordinates(charlotteX, charlotteY,
                orlandoX, orlandoY);

        double s = computeAreaOfTriangle(charlotteSavannahDistance, savannahOrlandoDistance, charlotteOrlandoDistance) +
                computeAreaOfTriangle(orlandoAtlantaDistance, atlantaCharlotteDistance, charlotteOrlandoDistance);
        System.out.println("Area is " + s);
    }



    public static double computeDistanceByCoordinates(double x1, double y1,
                                                        double x2, double y2) {
        final double radius = 6371.01;
        return radius * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) *
                        Math.cos(Math.toRadians(y1) - Math.toRadians(y2)));
    }

    public static double computeAreaOfTriangle(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

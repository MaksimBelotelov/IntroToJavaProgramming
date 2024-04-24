package org.example.ch4;

/*
    (Random points on a circle) Write a program that generates three random points
    on a circle centered at (0, 0) with radius 40 and displays three angles in a triangle
    formed by these three points, as shown in Figure 4.4a. Display the angles in
    degrees.
 */

public class Ex4_6 {
    public static void main(String[] args) {
        final double RADIUS = 40;

        double angle1 = Math.random() * (2 * Math.PI);
        double angle2 = Math.random() * (2 * Math.PI);
        double angle3 = Math.random() * (2 * Math.PI);

        double x1 = RADIUS * Math.cos(angle1);
        double y1 = RADIUS * Math.sin(angle1);
        double x2 = RADIUS * Math.cos(angle2);
        double y2 = RADIUS * Math.sin(angle2);
        double x3 = RADIUS * Math.cos(angle3);
        double y3 = RADIUS * Math.sin(angle3);

        double AB = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double BC = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        double AC = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));

        double cosAlpha = (AC * AC - AB * AB + BC * BC) / (2 * AC * BC);
        double cosBeta = (AB * AB - AC * AC + BC * BC) / (2 * AB * BC);
        double cosGamma = (AB * AB - BC * BC + AC * AC) / (2 * AB * AC);

        System.out.printf("Alpha = %f degrees\n", Math.toDegrees(Math.acos(cosAlpha)));
        System.out.printf("Beta = %f degrees\n", Math.toDegrees(Math.acos(cosBeta)));
        System.out.printf("Gamma = %f degrees\n", Math.toDegrees(Math.acos(cosGamma)));
    }
}

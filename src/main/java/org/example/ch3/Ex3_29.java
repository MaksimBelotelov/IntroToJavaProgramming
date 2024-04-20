package org.example.ch3;

/*
    (Geometry: two circles) Write a program that prompts the user to enter the center
    coordinates and radii of two circles and determines whether the second circle
    is inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: cir-
    cle2 is inside circle1 if the distance between the two centers 6 = r1 − r2
    and circle2 overlaps circle1 if the distance between the two centers 6 =
    r1 + r2. Test your program to cover all cases.
*/

import java.util.Scanner;

public class Ex3_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double circle1CenterX = scanner.nextDouble();
        double circle1CenterY = scanner.nextDouble();
        double circle1Radius = scanner.nextDouble();

        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double circle2CenterX = scanner.nextDouble();
        double circle2CenterY = scanner.nextDouble();
        double circle2Radius = scanner.nextDouble();

        double s = Math.sqrt(Math.pow(circle1CenterX - circle2CenterX, 2) +
                Math.pow(circle1CenterY - circle2CenterY, 2));

        if (s <= circle1Radius - circle2Radius)
            System.out.println("circle 2 is inside circle 1");
        else if (s <= circle1Radius + circle2Radius)
            System.out.println("circle 2 overlaps circle 1");
        else
            System.out.println("circle 2 doesn't overlap circle 1");
    }
}

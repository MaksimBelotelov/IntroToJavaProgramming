package org.example.ch9;

import java.util.Scanner;

/*
(Geometry: intersecting point) Suppose two line segments intersect. The two end-
points for the first line segment are (x1, y1) and (x2, y2) and for the second line
segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
these four endpoints and displays the intersecting point. As discussed in Program-
ming Exercise 3.25, the intersecting point can be found by solving a linear equa-
tion. Use the LinearEquation class in Programming Exercise 9.11 to solve this
equation. See Programming Exercise 3.25 for sample runs.
 */
public class Ex9_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] coordinates = new double[4][2];

        for (int i = 0; i < 4; i++) {
            System.out.printf("Enter x%d:", i + 1);
            coordinates[i][0] = scanner.nextDouble();
            System.out.printf("Enter y%d:", i + 1);
            coordinates[i][1] = scanner.nextDouble();
        }

        LinearEquation linearEquation = new LinearEquation(
                coordinates[0][1] - coordinates[1][1],
                coordinates[0][0] - coordinates[1][0],
                coordinates[2][1] - coordinates[3][1],
                coordinates[2][0] - coordinates[3][0],
                (coordinates[0][1] - coordinates[1][1]) * coordinates[0][0] -
                        (coordinates[0][0] - coordinates[1][0]) * coordinates[0][1],
                (coordinates[2][1] - coordinates[3][1]) * coordinates[2][0] -
                        (coordinates[2][0] - coordinates[3][0]) * coordinates[2][1]
        );

        if (linearEquation.isSolvable()) {
            System.out.printf("The intersection point is (%.2f, %.2f)\n", linearEquation.getX(),
                    linearEquation.getY());
        }
        else {
            System.out.println("The lines are parallel");
        }
    }
}


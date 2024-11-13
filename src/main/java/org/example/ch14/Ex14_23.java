package org.example.ch14;

//        (Geometry: two rectangles) Write a program that prompts the user to enter the
//        center coordinates, width, and height of two rectangles from the command line.
//        The program displays the rectangles and a text indicating whether the two are
//        overlapping, whether one is contained in the other, or whether they don’t over-
//        lap. See Programming Exercise 10.13 for checking the
//        relationship between two rectangles.

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class Ex14_23 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        double x1, y1, w1, h1;
        double x2, y2, w2, h2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the center coordinates, width and height of first rectangle: ");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        w1 = scanner.nextDouble();
        h1 = scanner.nextDouble();

        System.out.println("Enter the center coordinates, width and height of second rectangle: ");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        w2 = scanner.nextDouble();
        h2 = scanner.nextDouble();

        Rectangle r1 = new Rectangle(x1 - w1 / 2, y1 - h1 / 2, w1, h1);
        r1.setFill(null);
        r1.setStroke(Color.RED);
        Rectangle r2 = new Rectangle(x2 - w2 / 2, y2 - h2 / 2, w2, h2);
        r2.setFill(null);
        r2.setStroke(Color.GREEN);

        double paneWidth = 300;
        double paneHeight = 300;

        BorderPane pane = new BorderPane();

        String message;

        if (contain(r1, r2))
            message = "Contains";
        else if (overlaps(r1, r2))
            message = "Overlaps";
        else
            message = "Don't overlap";

        Text text = new Text(message);

        Group group = new Group(r1, r2);

        pane.setCenter(group);
        pane.setBottom(text);

        Scene scene = new Scene(pane, paneWidth, paneHeight);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static boolean contain(Rectangle r1, Rectangle r2) {
        Rectangle large, small;
        if (r1.getWidth() >= r2.getWidth()) {
            large = r1;
            small = r2;
        } else {
            large = r2;
            small = r1;
        }

        double downRightX = small.getX() + small.getWidth();
        double downRightY = small.getY() + small.getHeight();

        return containsPoint(large, small.getX(), small.getY()) &&
                containsPoint(large, downRightX, downRightY);
    }

    public static boolean overlaps(Rectangle r1, Rectangle r2) {
        return (Math.abs(r1.getX() - r2.getX()) <= r1.getWidth() / 2 + r2.getWidth() / 2 &&
            Math.abs(r1.getY() - r2.getY()) <= r1.getHeight() / 2 + r2.getHeight() / 2 &&
            !contain(r1, r2));
    }

    public static boolean containsPoint(Rectangle r, double x, double y) {
        double downRightX = r.getX() + r.getWidth();
        double downRightY = r.getY() + r.getHeight();

        return (x > r.getX() && x < downRightX &&
                y > r.getY() && y < downRightY);
    }
}

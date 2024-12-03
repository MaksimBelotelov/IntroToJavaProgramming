package org.example.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
    (Two movable vertices and their distances) Write a program that displays two
    circles with radius 10 at location (40, 40) and (120, 150) with a line connecting
    the two circles, as shown in Figure 15.30b. The distance between the circles
    is displayed along the line. The user can drag a circle. When that happens, the
    circle and its line are moved, and the distance between the circles is updated.
 */

public class Ex15_16 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Circle c1 = new Circle(40, 40, 10);
        c1.setFill(Color.WHITE);
        c1.setStroke(Color.BLACK);

        Circle c2 = new Circle(120, 150, 10);
        c2.setFill(Color.WHITE);
        c2.setStroke(Color.BLACK);

        Line line = new Line(c1.getCenterX(), c1.getCenterY(), c2.getCenterX(), c2.getCenterY());

        double s = Math.sqrt(Math.pow((c1.getCenterX() - c2.getCenterX()), 2) +
                Math.pow(c1.getCenterY() - c2.getCenterY(), 2));

        Text text = new Text((c1.getCenterX() + c2.getCenterX()) / 2,
                (c1.getCenterY() + c2.getCenterY()) / 2, String.format("%.2f", s));

        Pane pane = new Pane(c1, c2, line, text);

        c1.setOnMouseDragged(e -> {
            c1.setCenterX(e.getX());
            c1.setCenterY(e.getY());
            line.setStartX(e.getX());
            line.setStartY(e.getY());
            double newS = Math.sqrt(Math.pow((c1.getCenterX() - c2.getCenterX()), 2) +
                    Math.pow(c1.getCenterY() - c2.getCenterY(), 2));
            text.setX((c1.getCenterX() + c2.getCenterX()) / 2);
            text.setY((c1.getCenterY() + c2.getCenterY()) / 2);
            text.setText(String.format("%.2f", newS));
        });

        c2.setOnMouseDragged(e -> {
            c2.setCenterX(e.getX());
            c2.setCenterY(e.getY());
            line.setEndX(e.getX());
            line.setEndY(e.getY());
            double newS = Math.sqrt(Math.pow((c1.getCenterX() - c2.getCenterX()), 2) +
                    Math.pow(c1.getCenterY() - c2.getCenterY(), 2));
            text.setX((c1.getCenterX() + c2.getCenterX()) / 2);
            text.setY((c1.getCenterY() + c2.getCenterY()) / 2);
            text.setText(String.format("%.2f", newS));
        });

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

package org.example.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
    (Geometry: inside a circle?) Write a program that draws a fixed circle centered
    at (100, 60) with radius 50. Whenever the mouse is moved, display a message
    indicating whether the mouse point is inside the circle at the mouse point or
    outside of it, as shown in Figure 15.29a.
 */

public class Ex15_12 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(100, 60, 50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        Text text = new Text();

        Pane pane = new Pane(circle, text);

        pane.setOnMouseMoved(e -> {
            text.setX(e.getX());
            text.setY(e.getY());
            text.setText(circle.contains(e.getX(), e.getY()) ?
                    "Mouse point is inside the circle":
                    "Mouse point is outside");
        });

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

package org.example.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/*
    (Move a rectangle using mouse) Write a program that displays a rectangle.
    You can point the mouse inside the rectangle and drag (i.e., move with mouse
    pressed) the rectangle wherever the mouse goes. The mouse point becomes the
    center of the rectangle.
*/

public class Ex15_18 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Rectangle rectangle = new Rectangle(100, 100, 100, 50);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);

        Pane pane = new Pane(rectangle);
        Scene scene = new Scene(pane, 400, 200);

        rectangle.setOnMouseDragged(e -> {
            rectangle.setX(e.getX() - rectangle.getWidth() / 2);
            rectangle.setY(e.getY() - rectangle.getHeight() / 2);
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

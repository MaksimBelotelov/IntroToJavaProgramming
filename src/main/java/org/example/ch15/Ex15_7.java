package org.example.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/*
    (Change color using a mouse) Write a program that displays the color of a
    circle as black when the mouse button is pressed, and as white when the mouse
    button is released.
 */

public class Ex15_7 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(20);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        StackPane pane = new StackPane();
        pane.getChildren().add(circle);

        pane.setOnMousePressed(e -> circle.setFill(Color.BLACK));
        pane.setOnMouseReleased(e -> circle.setFill(Color.WHITE));

        Scene scene = new Scene(pane, 100, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

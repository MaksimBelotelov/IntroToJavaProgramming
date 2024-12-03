package org.example.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/*
    (Geometry: add and remove points) Write a program that lets the user click on
    a pane to dynamically create and remove points (see Figure 15.30a). When the
    user left-clicks the mouse (primary button), a point is created and displayed
    at the mouse point. The user can remove a point by pointing to it and right-
    clicking the mouse (secondary button).
*/


public class Ex15_15 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        pane.setOnMousePressed(e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
                Circle circle = new Circle(e.getX(), e.getY(), 10);
                circle.setFill(Color.WHITE);
                circle.setStroke(Color.BLACK);
                pane.getChildren().add(circle);
            }
            else {
                for (var item : pane.getChildren()) {
                    if (item.contains(e.getX(), e.getY())) {
                        pane.getChildren().remove(item);
                        break;
                    }
                }
            }
        });

        Scene scene = new Scene(pane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

package org.example.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/*
    (Move a circle using keys) Write a program that moves a circle up, down, left,
    or right using the arrow keys.
 */

public class Ex15_11 extends Application {
    @Override
    public void start(Stage primaryStage) {
        MyCircleMovingPane pane = new MyCircleMovingPane();

        pane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN -> {
                    if (pane.getY() < pane.getHeight() - MyCircleMovingPane.RADIUS)
                        pane.setY(pane.getY() + 5);
                }

                case UP -> {
                    if (pane.getY() > CircleMovingPane.radius)
                        pane.setY(pane.getY() - 5);
                }

                case RIGHT -> {
                    if (pane.getX() < pane.getWidth() - CircleMovingPane.radius)
                        pane.setX(pane.getX() + 5);
                }

                case LEFT -> {
                    if (pane.getX() > CircleMovingPane.radius)
                        pane.setX(pane.getX() - 5);
                }
            }
        });

        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }
}

class MyCircleMovingPane extends Pane {
    public static final double RADIUS = 20;
    private double x = 150;
    private double y = 150;
    private Circle circle;

    MyCircleMovingPane() {
        circle = new Circle(x, y, RADIUS);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        getChildren().add(circle);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
        circle.setCenterX(x);
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
        circle.setCenterY(y);
    }
}
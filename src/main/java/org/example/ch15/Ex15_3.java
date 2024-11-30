package org.example.ch15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/*
    (Move the ball) Write a program that moves the ball in a pane. You should
    define a pane class for displaying the ball and provide the methods for moving
    the ball left, right, up, and down, as shown in Figure 15.26c. Check the boundary
    to prevent the ball from moving out of sight completely.
 */

public class Ex15_3 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");
        Button btUp = new Button("Up");
        Button btDown = new Button("Down");

        HBox hBox = new HBox();
        hBox.setSpacing(5);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(btLeft, btRight, btUp, btDown);

        CircleMovingPane circlePane = new CircleMovingPane();
        BorderPane pane = new BorderPane();

        pane.setCenter(circlePane);
        pane.setBottom(hBox);

        btDown.setOnAction(e -> {
            if (circlePane.getY() < circlePane.getHeight() - CircleMovingPane.radius)
                circlePane.setY(circlePane.getY() + 5);
        });

        btUp.setOnAction(e -> {
            if (circlePane.getY() > CircleMovingPane.radius)
                circlePane.setY(circlePane.getY() - 5);
        });

        btRight.setOnAction(e -> {
            if (circlePane.getX() < circlePane.getWidth() - CircleMovingPane.radius)
                circlePane.setX(circlePane.getX() + 5);
        });

        btLeft.setOnAction(e -> {
            if (circlePane.getX() > CircleMovingPane.radius)
                circlePane.setX(circlePane.getX() - 5);
        });

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class CircleMovingPane extends Pane {
    public static final double radius = 20;
    private double x;
    private double y;
    private Circle circle;

    CircleMovingPane() {
        x = radius;
        y = radius;

        circle = new Circle(x, y, radius);
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

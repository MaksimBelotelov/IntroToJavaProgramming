package org.example.ch15;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Iterator;

/*
    (Geometry: find the bounding rectangle) Write a program that enables the user
    to add and remove points in a two-dimensional plane dynamically, as shown
    in Figure 15.31a. A minimum bounding rectangle is updated as the points are
    added and removed. Assume the radius of each point is 10 pixels.
 */

public class Ex15_17 extends Application {
    double minX = Double.MAX_VALUE;
    double minY = Double.MAX_VALUE;
    double maxX = -1;
    double maxY = -1;

    @Override
    public void start(Stage primaryStage) {
        Rectangle rect = new Rectangle();
        rect.setFill(Color.WHITE);
        rect.setStroke(Color.BLACK);
        Pane pane = new Pane(rect);

        pane.setOnMousePressed(e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
                Circle circle = new Circle(e.getX(), e.getY(), 10);
                circle.setFill(Color.WHITE);
                circle.setStroke(Color.BLACK);
                if (e.getX() < minX) minX = e.getX();
                if (e.getY() < minY) minY = e.getY();
                if (e.getX() > maxX) maxX = e.getX();
                if (e.getY() > maxY) maxY = e.getY();
                pane.getChildren().add(circle);
            }

            else {
                Iterator<Node> it = pane.getChildren().iterator();
                while (it.hasNext()) {
                    Node item = it.next();
                    if (item instanceof Circle && item.contains(e.getX(), e.getY())) {
                        it.remove();
                        minY = Double.MAX_VALUE;
                        minX = Double.MAX_VALUE;
                        maxX = -1;
                        maxY = -1;
                        break;
                    }
                }

                for (var circle : pane.getChildren()) {
                    if (circle instanceof Circle) {
                        double centerX = ((Circle)(circle)).getCenterX();
                        double centerY = ((Circle)(circle)).getCenterY();
                        if (centerX < minX)
                            minX = centerX;
                        if (centerY < minY)
                            minY = centerY;
                        if (centerX > maxX)
                            maxX = centerX;
                        if (centerY > maxY)
                            maxY = centerY;
                    }
                }
            }
            rect.setX(minX - 10);
            rect.setY(minY - 10);
            rect.setWidth(maxX  - minX + 20);
            rect.setHeight(maxY - minY + 20);
        });

        Scene scene = new Scene(pane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

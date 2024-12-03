package org.example.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
    (Geometry: inside a polygon?) Write a program that draws a fixed polygon
    with points at (40, 20), (70, 40), (60, 80), (45, 45), and (20, 60). Whenever
    the mouse is moved, display a message indicating whether the mouse point
    is inside the polygon at the mouse point or outside of it, as shown in Figure15.29c.
    To detect whether a point is inside a polygon, use the contains method defined in
    the Node class.
*/

public class Ex15_14 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(40.0, 20.0, 70.0, 40.0, 60.0, 80.0, 45.0, 45.0, 20.0, 60.0);
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        Text text = new Text();
        Pane pane = new Pane(polygon, text);

        pane.setOnMouseMoved(e -> {
            text.setX(e.getX());
            text.setY(e.getY());
            text.setText(polygon.contains(e.getX(), e.getY()) ?
                    "Mouse point is inside the polygon":
                    "Mouse point is outside the polygon");
        });

        Scene scene = new Scene(pane, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
package org.example.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
    (Geometry: inside a rectangle?) Write a program that draws a fixed rectangle cen-
    tered at ( 100 , 60) with width 100 and height 40 . Whenever the mouse is moved,
    display a message indicating whether the mouse point is inside the rectangle at the
    mouse point or outside of it, as shown in Figure 15.29b. To detect whether a point
    is inside a polygon, use the contains method defined in the Node class.
*/

public class Ex15_13 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Rectangle rectangle = new Rectangle(100, 60, 100, 40);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);

        Text text = new Text();
        Pane pane = new Pane(rectangle, text);

        pane.setOnMouseMoved(e -> {
            text.setX(e.getX());
            text.setY(e.getY());
            text.setText(rectangle.contains(e.getX(), e.getY()) ?
                    "Mouse point is inside the rectangle":
                    "Mouse point is outside the rectangle");
        });

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

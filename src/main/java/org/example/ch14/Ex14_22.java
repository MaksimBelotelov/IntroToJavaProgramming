package org.example.ch14;

//(Connect two circles) Write a program that draws two filled circles with radius
//15 pixels, centered at random locations, with a line connecting the two circles.
//The line should not cross inside the circles, as shown in Figure 14.49c.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Ex14_22 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        double paneWidth = 300;
        double paneHeight = 300;
        double radius = 15;

        double x1 = radius + Math.random() * (paneWidth - 2 * radius);
        double y1 = radius + Math.random() * (paneHeight - 2 * radius);
        double x2 = radius + Math.random() * (paneWidth - 2 * radius);
        double y2 = radius + Math.random() * (paneHeight - 2 * radius);

        Line line = new Line(x1, y1, x2, y2);
        Circle circle1 = new Circle(x1, y1, radius);
        Circle circle2 = new Circle(x2, y2, radius);

        circle1.setFill(Color.WHITE);
        circle2.setFill(Color.WHITE);

        circle1.setStroke(Color.BLACK);
        circle2.setStroke(Color.BLACK);

        Pane pane = new Pane();

        pane.getChildren().addAll(line, circle1, circle2);

        Scene scene = new Scene(pane, paneWidth, paneHeight);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

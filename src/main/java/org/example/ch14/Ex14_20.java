package org.example.ch14;

/*
(Draw an arrow line) Write a static method that draws an arrow line from a
starting point to an ending point in a pane using the following method header:

public static void drawArrowLine(double startX, double startY,
double endX, double endY, Pane pane)
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Ex14_20 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        double width = 300;
        double height = 300;

        Pane pane = new Pane();

        double x0 = Math.random() * width;
        double y0 = Math.random() * height;
        double x1 = Math.random() * width;
        double y1 = Math.random() * height;
        drawArrowLine(x0, y0, x1, y1, pane);

        Scene scene = new Scene(pane, width, height);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void drawArrowLine(double startX, double startY,
                                     double endX, double endY, Pane pane) {

        Line line = new Line(startX, startY, endX, endY);

        double dx = endX - startX;
        double dy = endY - startY;

        double angle = Math.atan(dy / dx);
        double len = 20;

        double correction = (dx < 0) ? 1.57 : 0;

        double endX1 = endX - len * Math.cos(angle + correction + 0.78);
        double endY1 = endY - len * Math.sin(angle + correction + 0.78);

        double endX2 = endX - len * Math.cos(angle - correction - 0.78);
        double endY2 = endY - len * Math.sin(angle - correction - 0.78);

        Line first = new Line(endX, endY, endX1, endY1);
        Line second = new Line(endX, endY, endX2, endY2);

        pane.getChildren().addAll(line, first, second);
    }
}

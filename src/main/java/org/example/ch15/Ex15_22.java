package org.example.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/*
    (Auto resize cylinder) Rewrite Programming Exercise 14.10 so the cylinder’s
    width and height are automatically resized when the window is resized.
*/

public class Ex15_22 extends Application {
    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(new MyCylinder(), 200, 200);
        primaryStage.setTitle("Exercise14_10");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class MyCylinder extends Pane {
    public void paint() {
        double centerX = getWidth() / 2;
        double radiusX = getWidth() * 0.8 / 2;
        double centerY = getHeight() / 3;
        double radiusY = getHeight() * 0.1;
        double h = centerY + getHeight() / 6;

        Ellipse ellipse = new Ellipse(centerX, centerY, radiusX, radiusY);
        ellipse.setFill(Color.WHITE);
        ellipse.setStroke(Color.BLACK);

        Arc arc1 = new Arc(centerX, centerY + h, radiusX, radiusY, 0, 180);
        arc1.setFill(Color.WHITE);
        arc1.setStroke(Color.BLACK);
        arc1.getStrokeDashArray().addAll(6.0, 21.0);

        Arc arc2 = new Arc(centerX, centerY + h, radiusX, radiusY, 180, 180);
        arc2.setFill(Color.WHITE);
        arc2.setStroke(Color.BLACK);

        getChildren().clear();
        getChildren().addAll(ellipse, arc1, arc2,
                new Line(centerX - radiusX, centerY, centerX - radiusX, centerY + h),
                new Line(centerX + radiusX, centerY, centerX + radiusX, centerY + h));
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        paint();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        paint();
    }
}

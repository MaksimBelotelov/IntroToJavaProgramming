package org.example.ch14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Ex14_10 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new MyCylinder(), 300, 200);
        primaryStage.setTitle("Ex14_10");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class MyCylinder extends Pane {
    private void paint() {
        getChildren().clear();

        double centerX = getWidth() / 2;
        double centerY = getHeight() / 4;
        double radiusX = 100;
        double radiusY = radiusX / 4;
        double height = 100;

        Ellipse top = new Ellipse(centerX, centerY,
                radiusX, radiusY);
        top.setStroke(Color.BLACK);
        top.setFill(Color.WHITE);
        getChildren().add(top);

        Line leftSide = new Line(centerX - radiusX, centerY,
                centerX - radiusX, centerY + height);
        getChildren().add(leftSide);

        Line rightSide = new Line(centerX + radiusX, centerY,
                centerX + radiusX, centerY + height);
        getChildren().add(rightSide);

        Arc frontArc = new Arc(centerX, centerY + height, radiusX, radiusY, 180, 180);
        frontArc.setType(ArcType.OPEN);
        frontArc.setFill(null);
        frontArc.setStroke(Color.BLACK);
        getChildren().add(frontArc);

        Arc rearArc = new Arc(centerX, centerY + height, radiusX, radiusY, 0, 180);
        rearArc.setStroke(Color.BLACK);
        rearArc.setFill(null);
        rearArc.getStrokeDashArray().addAll(6.0, 21.0);

        getChildren().add(rearArc);
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
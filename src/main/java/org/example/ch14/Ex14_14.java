package org.example.ch14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex14_14 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new Rectanguloid(), 300, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ex14_14");
        primaryStage.show();
    }
}

class Rectanguloid extends Pane {
    public void paint() {
        getChildren().clear();

        double h = getHeight() * 0.7;
        double w = getWidth() * 0.8;
        double shift = 30;

        Rectangle frontRectangle = new Rectangle(10, 50, w, h);
        frontRectangle.setFill(null);
        frontRectangle.setStroke(Color.BLACK);

        Rectangle backRectangle = new Rectangle(10 + shift, 50 - shift, w, h);
        backRectangle.setFill(null);
        backRectangle.setStroke(Color.BLACK);

        Line l1 = new Line(10, 50, 10 + shift, 50 - shift);
        Line l2 = new Line(10 + w, 50, 10 + w + shift, 50 - shift);
        Line l3 = new Line(10, 50 + h, 10 + shift, 50 + h - shift);
        Line l4 = new Line(10 + w, 50 + h, 10 + w + shift, 50 + h - shift);

        getChildren().addAll(frontRectangle, backRectangle, l1, l2, l3, l4);
    }

    @Override
    protected void setWidth(double v) {
        super.setWidth(v);
        paint();
    }

    @Override
    protected void setHeight(double v) {
        super.setHeight(v);
        paint();
    }
}

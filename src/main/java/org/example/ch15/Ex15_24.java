package org.example.ch15;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/*
     (Animation: pendulum swing) Write a program that animates a pendulum
    swing, as shown in Figure 15.33. Press/release the mouse to pause/resume the
    animation.
 */

public class Ex15_24 extends Application {
    @Override
    public void start(Stage primaryStage) {
        MyArcPane pane = new MyArcPane();


        Scene scene = new Scene(pane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class MyArcPane extends Pane {
    public void paint() {
        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;
        double radiusX = getWidth() / 4;
        double radiusY = getHeight() / 6;

        Arc arc = new Arc(centerX, centerY, radiusX, radiusY,-160, 140);
        arc.setType(ArcType.OPEN);
        arc.setFill(Color.WHITE);
        arc.setStroke(Color.BLACK);

        Circle circle = new Circle(20);
        circle.setFill(Color.ORANGE);


        getChildren().clear();
        getChildren().addAll(arc, circle);

        PathTransition pathTransition = new PathTransition();
        pathTransition.setPath(arc);
        pathTransition.setNode(circle);
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        pathTransition.setAutoReverse(true);
        pathTransition.setDuration(Duration.millis(5000));

        pathTransition.play();

        this.setOnMousePressed(e -> pathTransition.pause());
        this.setOnMouseReleased(e -> pathTransition.play());
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



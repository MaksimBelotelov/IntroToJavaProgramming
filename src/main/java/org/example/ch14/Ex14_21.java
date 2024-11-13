package org.example.ch14;

//(Two circles and their distance) Write a program that draws two circles with
//radius 15 pixels, centered at random locations, with a line connecting the two
//circles. The distance between the two centers is displayed on the line, as shown
//in Figure 14.49b.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex14_21 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        double paneWidth = 300;
        double paneHeight = 300;
        double radius = 15;

        double centerXFirst = radius + Math.random() * (paneWidth - 2 * radius);
        double centerYFirst = radius + Math.random() * (paneHeight - 2 * radius);

        double centerXSecond = radius + Math.random() * (paneWidth - 2 * radius);
        double centerYSecond = radius + Math.random() * (paneHeight - 2 * radius);

        double s = Math.sqrt(Math.pow(centerXSecond - centerXFirst, 2) -
                Math.pow(centerYSecond - centerYFirst, 2));

        Line line = new Line(centerXFirst, centerYFirst, centerXSecond, centerYSecond);
        Circle circle1 = new Circle(centerXFirst, centerYFirst, radius);
        Circle circle2 = new Circle(centerXSecond, centerYSecond, radius);

        circle1.setFill(Color.BLACK);
        circle2.setFill(Color.BLACK);
        Text text = new Text((centerXSecond + centerXFirst) / 2, (centerYSecond + centerYFirst) / 2, s + "");

        Pane pane = new Pane();
        pane.getChildren().addAll(circle1, circle2, line, text);

        Scene scene = new Scene(pane, paneWidth, paneHeight);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
package org.example.ch14;

/*
    (Create four fans) Write a program that places four fans in a GridPane with two
    rows and two columns, as shown in Figure 14.45b.
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ex14_9 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        double centerX = 100;
        double centerY = 100;
        double radius = 100;

        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(10, 10, 10,10));

        for (int i = 0; i < 4; i++) {
            Pane pane = new Pane();
            Circle circle = new Circle(centerX, centerY, radius);
            circle.setFill(null);
            circle.setStroke(Color.BLACK);
            pane.getChildren().add(circle);
            for (int j = 0; j < 4; j++) {
                Arc arc = new Arc(centerX, centerY, radius - 5, radius - 5, 30 + 90 * j, 30);
                arc.setFill(Color.RED);
                arc.setType(ArcType.ROUND);
                pane.getChildren().add(arc);
            }
            gridPane.add(pane, i % 2, i / 2);
        }

        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Ex14_9");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

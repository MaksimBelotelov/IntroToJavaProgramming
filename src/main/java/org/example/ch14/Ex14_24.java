package org.example.ch14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex14_24 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Polygon polygon = new Polygon();

        polygon.setStroke(Color.BLACK);
        polygon.setFill(Color.WHITE);
        ObservableList<Double> points = polygon.getPoints();

        points.addAll(
                10.0, 10.0,
                100.0, 10.0,
                100.0, 100.0,
                10.0, 100.0);

        double pointX = 50.0;
        double pointY = 60.0;

        double width = 300;
        double height = 200;

        Pane pane = new Pane();
        Text text = new Text(10, height - 10, "");
        
        if (polygon.contains(pointX, pointY))
            text.setText("Inside the polygon");
        else
            text.setText("Outside");

        pane.getChildren().addAll(polygon, new Circle(pointX, pointY, 5), text);

        Scene scene = new Scene(pane, width, height);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
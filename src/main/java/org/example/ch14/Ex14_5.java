package org.example.ch14;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex14_5 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        String str = "Welcome to Java";
        Pane pane = new Pane();
        char[] chars = str.toCharArray();

        Point2D center = new Point2D(150, 150);
        double radius = 100;
        double angle = 0;

        for(int i = 0; i < chars.length; i++) {
            double x = center.getX() + radius * Math.cos(Math.toRadians(angle));
            double y = center.getY() + radius * Math.sin(Math.toRadians(angle));

            Text text = new Text(x, y, Character.toString(chars[i]));
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
            text.setRotate(angle + 90);
            pane.getChildren().add(text);
            angle += 23;
        }

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Characters around circle");
        primaryStage.show();
    }
}
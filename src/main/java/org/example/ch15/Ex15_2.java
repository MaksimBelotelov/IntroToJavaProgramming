package org.example.ch15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/*
    (Rotate a rectangle) Write a program that rotates a rectangle 15 degrees to the
    right when the Rotate button is clicked, as shown in Figure 15.26b.
 */

public class Ex15_2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Rectangle rectangle = new Rectangle(100, 50);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);

        Button btRotate = new Button("Rotate");

        BorderPane borderPane = new BorderPane();

        borderPane.setCenter(rectangle);
        borderPane.setBottom(btRotate);
        BorderPane.setAlignment(btRotate, Pos.CENTER);

        btRotate.setOnAction(e ->
                rectangle.setRotate(rectangle.getRotate() + 15));

        Scene scene = new Scene(borderPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

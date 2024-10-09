package org.example.ch14;

/*
(Display random 0 or 1) Write a program that displays a 10-by-10 square matrix,
as shown in Figure 14.45a. Each element in the matrix is 0 or 1, randomly gener-
ated. Display each number centered in a text field. Use TextField’s setText
method to set value 0 or 1 as a string.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex14_7 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                TextField field = new TextField();
                field.setPrefColumnCount(1);
                field.setAlignment(Pos.CENTER);
                field.setText(Integer.toString((int)(Math.random() * 2)));
                field.setEditable(false);
                grid.add(field, i, j);
            }
        }

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise14_07");
        primaryStage.show();
    }
}
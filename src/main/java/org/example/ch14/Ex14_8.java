package org.example.ch14;

/*
(Display 54 cards) Expand Exercise 14.3 to display all 54 cards (including two
jokers), nine per row. The image files are jokers and are named 53.png and 54.png.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex14_8 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        for (int i = 0; i < 54; i++) {
            ImageView imageView =
                    new ImageView("card/" + (i + 1) + ".png");
            gridPane.add(imageView, i % 9, i / 9);
        }

        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Ex14_8");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

package org.example.ch14;

//(Tic-tac-toe board) Write a program that displays a tic-tac-toe board, as
//shown in Figure 14.43b. A cell may be X, O, or empty. What to display
//at each cell is randomly decided. The X and O are the image files x.gif
//and o.gif.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Random;

public class Ex14_2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        String[] names = {"o.gif", "x.gif"};
        Random rnd = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int current = rnd.nextInt(0, 3);
                if (current < 2) {
                    gridPane.add(new ImageView(new Image(names[current])), i, j);
                }
            }
        }

        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Tic-tac");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

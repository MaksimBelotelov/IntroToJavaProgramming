package org.example.ch14;

/*
(Display images) Write a program that displays four images in a grid pane, as
shown in Figure 14.43a.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex14_1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11, 11, 11, 11));
        pane.setHgap(2);
        pane.setVgap(2);

        int n = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                String name = "flag" + n + ".gif";
                n++;
                Image img = new Image(name);
                pane.add(new ImageView(img), i, j);
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowGridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

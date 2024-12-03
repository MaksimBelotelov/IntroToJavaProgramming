package org.example.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

/*
    (Draw lines using the arrow keys) Write a program that draws line segments
    using the arrow keys. The line starts from (100, 100) in the pane and draws
    toward east, north, west, or south when the right-arrow key, up-arrow key,
    left-arrow key, or down-arrow key is pressed, as shown in Figure 15.28b.
*/

public class Ex15_9 extends Application {
    private double x = 100;
    private double y = 100;
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Polyline polyline = new Polyline();
        polyline.getPoints().add(x);
        polyline.getPoints().add(y);
        pane.getChildren().add(polyline);

        pane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN:
                    y += 5; break;
                case UP:
                    y -= 5; break;
                case LEFT:
                    x -= 5; break;
                case RIGHT:
                    x += 5; break;
                default:
                    System.out.println("Can't read code");
            }
            polyline.getPoints().add(x);
            polyline.getPoints().add(y);
        });

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ex15_09");
        primaryStage.show();

        pane.requestFocus();
    }
}

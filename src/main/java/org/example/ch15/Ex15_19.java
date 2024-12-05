package org.example.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

/*
    (Game: eye–hand coordination) Write a program that displays a circle of
    radius 10 pixels filled with a random color at a random location on a pane, as
    shown in Figure 15.31b. When you click the circle, it disappears and a new
    random-color circle is displayed at another random location. After 20 circles
    are clicked, display the time spent in the pane, as shown in Figure 15.31c.
*/

public class Ex15_19 extends Application {
    public static final double width = 800;
    public static final double height = 600;
    public static final double R = 10;

    Random random = new Random();
    Circle circle = new Circle(random.nextDouble(R / 2, width - R),
            random.nextDouble(R / 2, width - R), R);
    int i = 1;

    @Override
    public void start(Stage primaryStage) {
        circle.setStroke(Color.BLACK);

        Pane pane = new Pane(circle);


        long start = System.currentTimeMillis();

        pane.setOnMousePressed(e -> {
            if (i == 5) {
                long finish = System.currentTimeMillis();
                pane.getChildren().clear();
                long time = finish - start;
                pane.getChildren().add(new Text(20, 20,"Time spent is " + time + " milliseconds"));
            }
            else if (circle.contains(e.getX(), e.getY())) {
                nextCircle();
                i++;
            }
        });

        Scene scene = new Scene(pane, width, height);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void nextCircle() {
        double x = random.nextDouble(R / 2, width - R);
        double y = random.nextDouble(R / 2, height - R);
        circle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        circle.setCenterX(x);
        circle.setCenterY(y);
    }
}

package org.example.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
    (Geometry: display angles) Write a program that enables the user to drag the
    vertices of a triangle and displays the angles dynamically as the triangle shape
    changes, as shown in Figure 15.32a. The formula to compute angles is given in
    Listing 4.1.
*/

public class Ex15_20 extends Application {
    @Override
    public void start(Stage primaryStage) {
        TriangleVerticesPane pane = new TriangleVerticesPane();

        Scene scene = new Scene(pane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class TriangleVerticesPane extends Pane {
    private static final double R = 10;

    private final Circle[] circles = new Circle[3];
    private final Line[] lines = new Line[3];
    private final Text[] labels = new Text[3];

    TriangleVerticesPane() {
        circles[0] = new Circle(30, 30, R);
        circles[1] = new Circle(130, 30, R);
        circles[2] = new Circle(30, 130, R);

        for (int i = 0; i < 3; i++) {
            lines[i] = new Line();
            labels[i] = new Text();

            int finalI = i;
            circles[i].setOnMouseDragged(e -> {
                circles[finalI].setCenterX(e.getX());
                circles[finalI].setCenterY(e.getY());
                reDraw();
            });
            getChildren().addAll(lines[i], labels[i], circles[i]);
        }
        reDraw();
    }

    private double[] computeAngles() {
        double a = Math.sqrt(
                Math.pow((circles[1].getCenterX() - circles[2].getCenterX()), 2) +
                        Math.pow((circles[1].getCenterY() - circles[2].getCenterY()), 2));

        double b = Math.sqrt(
                Math.pow((circles[0].getCenterX() - circles[2].getCenterX()), 2) +
                        Math.pow((circles[0].getCenterY() - circles[2].getCenterY()), 2));

        double c = Math.sqrt(
                Math.pow((circles[0].getCenterX() - circles[1].getCenterX()), 2) +
                        Math.pow((circles[0].getCenterY() - circles[1].getCenterY()), 2));

        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        return new double[]{A, B, C};
    }


    private void reDraw() {
        double[] angles = computeAngles();

        for (int i = 0; i < 3; i++) {
            lines[i].setStartX(circles[i].getCenterX());
            lines[i].setStartY(circles[i].getCenterY());
            lines[i].setEndX(circles[(i + 1) % 3].getCenterX());
            lines[i].setEndY(circles[(i + 1) % 3].getCenterY());

            labels[i].setText(String.format("%.2f", angles[i]));
            labels[i].setX(circles[i].getCenterX() + 10);
            labels[i].setY(circles[i].getCenterY() - 10);
        }
    }
}
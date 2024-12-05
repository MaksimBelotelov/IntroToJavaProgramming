package org.example.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
    (Drag points) Draw a circle with three random points on the circle. Connect
    the points to form a triangle. Display the angles in the triangle. Use the mouse
    to drag a point along the perimeter of the circle. As you drag it, the triangle and
    angles are redisplayed dynamically, as shown in Figure 15.32b. For computing
    angles in a triangle, see Listing 4.1.
 */

public class Ex15_21 extends Application {


    @Override
    public void start(Stage primaryStage) {
        TriangleInCirclePane pane = new TriangleInCirclePane();




        Scene scene = new Scene(pane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class TriangleInCirclePane extends Pane {
    public static final double R = 200;
    public static final double pointR = 10;

    private final Circle[] points = new Circle[3];
    private final Line[] lines = new Line[3];
    private final Text[] labels = new Text[3];

    public TriangleInCirclePane() {
        Circle circle = new Circle(400, 300, R);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);


        getChildren().add(circle);

        for (int i = 0; i < 3; i++) {
            lines[i] = new Line();
            labels[i] = new Text();

            double angle = Math.random() * (Math.PI * 2);
            double x = circle.getCenterX() + R * Math.cos(angle);
            double y = circle.getCenterY() + R * Math.sin(angle);
            points[i] = new Circle(x, y, pointR);

            getChildren().add(points[i]);

            int finalI = i;
            points[i].setOnMouseDragged(e -> {
                    if (circle.contains(e.getX(), e.getY())) {
                        points[finalI].setCenterX(e.getX());
                        points[finalI].setCenterY(e.getY());
                        reDraw();
                    }
            });

            getChildren().addAll(labels[i], lines[i]);
        }
        reDraw();
    }

    private double[] computeAngles() {
        double a = Math.sqrt(
                Math.pow((points[1].getCenterX() - points[2].getCenterX()), 2) +
                        Math.pow((points[1].getCenterY() - points[2].getCenterY()), 2));

        double b = Math.sqrt(
                Math.pow((points[0].getCenterX() - points[2].getCenterX()), 2) +
                        Math.pow((points[0].getCenterY() - points[2].getCenterY()), 2));

        double c = Math.sqrt(
                Math.pow((points[0].getCenterX() - points[1].getCenterX()), 2) +
                        Math.pow((points[0].getCenterY() - points[1].getCenterY()), 2));

        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        return new double[]{A, B, C};
    }

    private void reDraw() {
        double[] angles = computeAngles();

        for (int i = 0; i < 3; i++) {
            lines[i].setStartX(points[i].getCenterX());
            lines[i].setStartY(points[i].getCenterY());
            lines[i].setEndX(points[(i + 1) % 3].getCenterX());
            lines[i].setEndY(points[(i + 1) % 3].getCenterY());

            labels[i].setText(String.format("%.2f", angles[i]));
            labels[i].setX(points[i].getCenterX() + 10);
            labels[i].setY(points[i].getCenterY() - 10);
        }

    }
}

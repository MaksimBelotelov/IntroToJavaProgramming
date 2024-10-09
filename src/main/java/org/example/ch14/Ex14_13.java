package org.example.ch14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Ex14_13 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        double[] percents = {30, 30, 30, 10};

        Scene scene = new Scene(new PieChart(percents));
        primaryStage.setTitle("Ex14_13");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class PieChart extends Pane {
    private final double[] percents;

    public PieChart(double[] percents) {
        this.percents = percents;
    }

    public void paint() {
        getChildren().clear();

        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;
        double radius = Math.min(getHeight(), getWidth()) / 4;

        double currentAngle = 0;

        for (int i = 0; i < percents.length; i++) {
            double angle = 360 * percents[i] / 100;
            System.out.println("for percents: " + percents[i] + "angle: " + angle);
            Arc arc = new Arc(centerX, centerY, radius, radius, currentAngle, angle);
            currentAngle += angle;
            arc.setType(ArcType.ROUND);
            arc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            getChildren().add(arc);
        }
    }

    @Override
    protected void setWidth(double v) {
        super.setWidth(v);
        paint();
    }

    @Override
    protected void setHeight(double v) {
        super.setHeight(v);
        paint();
    }
}

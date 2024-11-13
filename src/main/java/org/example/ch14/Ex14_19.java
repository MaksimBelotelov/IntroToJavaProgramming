package org.example.ch14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex14_19 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(new AxisPane(), 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class AxisPane extends Pane {
    public void paint() {
        getChildren().clear();
        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;

        Line xAxis = new Line(0, centerY, getWidth(), centerY);
        Line yAxis = new Line(centerX, 0, centerX, getHeight());

        Text xLabel = new Text(getWidth() - 20, centerY + 20, "X");
        Text yLabel = new Text(centerX + 10, 20, "Y");
        Text oLabel = new Text(centerX + 10, centerY + 20, "0");

        Text minus2PiLbl = new Text(centerX - 100, centerY + 20, "-2\u03c0");
        Text minusPiLbl = new Text(centerX - 50, centerY + 20, "-\u03c0");
        Text plusPiLbl = new Text(centerX + 50, centerY + 20, "\u03c0");
        Text plus2PiLbl = new Text(centerX + 100, centerY + 20, "2\u03c0");

        getChildren().addAll(xAxis, xLabel, yAxis, yLabel, oLabel,
                minus2PiLbl, minusPiLbl, plusPiLbl, plus2PiLbl);


        Polyline sinLine = new Polyline();
        sinLine.setStroke(Color.RED);
        ObservableList<Double> sinList = sinLine.getPoints();

        double scaleFactor = 50;
        for (int x = -180; x <= 180; x++) {
            sinList.add(x + centerX);
            sinList.add(centerY - scaleFactor * Math.sin((x / 100.0) * 2 * Math.PI));
        }

        getChildren().add(sinLine);

        Polyline cosLine = new Polyline();
        cosLine.setStroke(Color.BLUE);
        ObservableList<Double> cosList = cosLine.getPoints();

        for (int x = -170; x <= 170; x++) {
            cosList.add(x + centerX);
            cosList.add(centerY - scaleFactor * Math.cos((x / 100.0) * 2 * Math.PI));
        }



        getChildren().add(cosLine);
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

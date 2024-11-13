package org.example.ch14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex14_15 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new Stop(), 400, 400);
        primaryStage.setTitle("Ex14_15");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class Stop extends StackPane {
    private void paint() {
        Polygon polygon = new Polygon();
        polygon.setFill(Color.RED);
        polygon.setStroke(Color.BLACK);
        ObservableList<Double> list = polygon.getPoints();

        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;
        double radius = Math.min(getWidth(), getHeight()) * 0.4;

        for (int i = 0; i < 6; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6));
            list.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));
        }

        Text text = new Text("STOP");
        text.setFill(Color.WHITE);
        text.setFont(Font.font("Courier", FontWeight.BOLD, 60));

        getChildren().clear();
        getChildren().addAll(polygon, text);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        paint();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        paint();
    }
}

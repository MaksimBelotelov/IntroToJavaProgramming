package org.example.ch14;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex14_12 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new BarChart(), 300, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Ex14_12");
        primaryStage.show();
    }
}

class BarChart extends BorderPane {
    int[] percents = {20, 10, 30, 20};

    public void paint(int[] percents) {
        getChildren().clear();

        double barWidth = getWidth() / percents.length - 20;
        System.out.println(barWidth);

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.BOTTOM_CENTER);
        hBox.setSpacing(10);

        for (int i = 0; i < percents.length; i++) {
            Label label = new Label(percents[i] + "%");

            Rectangle bar = new Rectangle(barWidth * i, getHeight() - (getHeight() * (percents[i] * 1.0/ 100)),
                    barWidth,getHeight() * (percents[i] * 1.0/ 100));
            bar.setFill(Color.color(Math.random(), Math.random(), Math.random()));

            VBox vBox = new VBox();
            vBox.getChildren().addAll(label, bar);
            vBox.setAlignment(Pos.BOTTOM_CENTER);

            hBox.getChildren().add(vBox);
        }
        setBottom(hBox);
    }

    @Override
    public void setWidth(double v) {
        super.setWidth(v);
        paint(percents);
    }

    @Override
    public void setHeight(double v) {
        super.setHeight(v);
        paint(percents);
    }
}
package org.example.ch14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Ex14_16 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new MyGrid(), 400, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


}

class MyGrid extends Pane {

    public static final int NUMBER_OF_VERTICALS = 2;
    public static final int NUMBER_OF_HORIZONTALS = 2;

    private void paint() {
        double width = getWidth() / (NUMBER_OF_VERTICALS + 1);
        double height = getHeight() / (NUMBER_OF_HORIZONTALS + 1);

        double currentX = width;
        double currentY = height;

        getChildren().clear();

        for (int i = 0; i < NUMBER_OF_VERTICALS; i++) {
            Line vline = new Line(currentX, 0, currentX, getHeight());
            vline.setStroke(Color.RED);
            getChildren().add(vline);
            currentX += width;
        }

        for (int j = 0; j < NUMBER_OF_HORIZONTALS; j++) {
            Line hLine = new Line(0, currentY, getWidth(), currentY);
            hLine.setStroke(Color.BLUE);
            getChildren().add(hLine);
            currentY += height;
        }
    }

    @Override
    protected void setHeight(double v) {
        super.setHeight(v);
        paint();
    }

    @Override
    protected void setWidth(double v) {
        super.setWidth(v);
        paint();
    }
}

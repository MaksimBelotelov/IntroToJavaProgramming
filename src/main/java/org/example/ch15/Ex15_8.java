package org.example.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
    (Display the mouse position) Write two programs, such that one displays the
    mouse position when the mouse button is clicked (see Figure 15.28a), and the
    other displays the mouse position when the mouse button is pressed and ceases
    to display it when the mouse button is released.
 */

public class Ex15_8 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Text text = new Text();

        pane.getChildren().add(text);

        pane.setOnMouseDragged(e -> {
            double x = e.getX();
            double y = e.getY();
            text.setText(String.format("(%.1f, %.1f)", x, y));
            text.setX(e.getX());
            text.setY(e.getY());
        });

        pane.setOnMouseReleased(e -> {text.setText("");});

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

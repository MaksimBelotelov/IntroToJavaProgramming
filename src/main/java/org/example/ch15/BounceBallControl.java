package org.example.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class BounceBallControl extends Application {
    @Override
    public void start(Stage primaryStage) {
        BallPane ballPane = new BallPane();

        ballPane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP)
                ballPane.increaseSpeed();
            else if (e.getCode() == KeyCode.DOWN)
                ballPane.decreaseSpeed();
        });
        
        Scene scene = new Scene(ballPane, 250, 150);
        primaryStage.setTitle("BounceBallControl");
        primaryStage.setScene(scene);
        primaryStage.show();

        ballPane.requestFocus();
    }
}

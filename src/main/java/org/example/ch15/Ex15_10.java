package org.example.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
    (Enter and display a string) Write a program that receives a string from the
    keyboard and displays it on a pane. The Enter key signals the end of a string.
    Whenever a new string is entered, it is displayed on the pane.
 */

public class Ex15_10 extends Application {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        Text text = new Text();
        pane.getChildren().add(text);

        pane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                text.setText(sb.toString());
                sb = new StringBuilder();
            }
            else
                sb.append(e.getText());
        });

        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }
}

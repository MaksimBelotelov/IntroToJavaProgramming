package org.example.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
    (Alternate two messages) Write a program to display the text Java is fun
    and Java is powerful alternately with a mouse click.
 */

public class Ex15_6 extends Application {
    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        Text text = new Text("Java is fun");
        pane.getChildren().add(text);

        pane.setOnMouseClicked(e ->
            text.setText(text.getText().equals("Java is fun") ? "Java is powerful" : "Java is fun")
        );

        Scene scene = new Scene(pane, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

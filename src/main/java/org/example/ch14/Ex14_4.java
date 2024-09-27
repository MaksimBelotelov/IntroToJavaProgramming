package org.example.ch14;

//(Color and font) Write a program that displays five texts vertically, as shown in
//Figure 14.44a. Set a random color and opacity for each text and set the font of
//each text to Times Roman, bold, italic, and 22 pixels.

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Ex14_4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        String text = "Java";
        Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);

        HBox hBox = new HBox();
        hBox.setSpacing(20);
        hBox.setAlignment(Pos.CENTER);

        for (int i = 0; i < 5; i++) {
            Label label = new Label(text);
            label.setFont(font);
            label.setTextFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));
            label.setRotate(90);
            hBox.getChildren().add(label);
        }

        Scene scene = new Scene(hBox, 300, 100);
        primaryStage.setTitle("Exercise14_04");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

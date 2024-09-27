package org.example.ch14;

//(Display three cards) Write a program that displays three cards randomly
//selected from a deck of 52, as shown in Figure 14.43c. The card image files are
//named 1.png, 2.png, . . . , 52.png and stored in the image/card directory. All
//three cards are distinct and selected randomly. (Hint: You can select random
//cards by storing the numbers 1–52 to an array list, perform a random shuffle
//introduced in Section 11.12, and use the first three numbers in the array list as
//the file names for the image.)

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Ex14_3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        final int NUMBER_OF_CARDS = 52;
        ArrayList<Integer> deck = new ArrayList<>(NUMBER_OF_CARDS);

        for (int i = 0; i < NUMBER_OF_CARDS; i++)
            deck.add(i + 1);
        Collections.shuffle(deck);

        Image card1 = new Image("card/" + deck.get(0) + ".png");
        Image card2 = new Image("card/" + deck.get(1) + ".png");
        Image card3 = new Image("card/" + deck.get(2) + ".png");

        HBox hBox = new HBox();
        hBox.setSpacing(5);
        hBox.getChildren().addAll(new ImageView(card1), new ImageView(card2), new ImageView(card3));

        Scene scene = new Scene(hBox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise14_03");
        primaryStage.show();
    }
}

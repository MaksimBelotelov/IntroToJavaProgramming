package org.example.ch15;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;

/*
    (Pick four cards) Write a program that lets the user click the Refresh button to
    display four cards from a deck of 52 cards, as shown in Figure 15.26a. (See the
    hint in Programming Exercise 14.3 on how to obtain four random cards.)
 */

public class Ex15_1 extends Application {
    public static final int  NUMBER_OF_CARDS = 52;
    private ArrayList<Integer> deck = new ArrayList<>(NUMBER_OF_CARDS);

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();
        HBox hBox = new HBox();
        Button btRefresh = new Button("Refresh");
        hBox.setSpacing(5);

        hBox.setPadding(new Insets(5, 5, 5, 5));
        BorderPane.setAlignment(btRefresh, Pos.CENTER);
        borderPane.setCenter(hBox);
        borderPane.setBottom(btRefresh);

        for (int i = 1; i <= NUMBER_OF_CARDS; i++)
            deck.add(i);

        for (Image cardImg : getFourCards())
            hBox.getChildren().add(new ImageView(cardImg));

        btRefresh.setOnAction(e -> {
            hBox.getChildren().clear();
            for (Image cardImg : getFourCards())
                hBox.getChildren().add(new ImageView(cardImg));
        });


        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Image[] getFourCards() {
        Collections.shuffle(deck);
        Image[] result = new Image[4];

        for (int i = 0; i < 4; i++)
            result[i] = new Image("card/" + deck.get(i) + ".png");

        return result;
    }

    private void refreshCards() {

    }
}

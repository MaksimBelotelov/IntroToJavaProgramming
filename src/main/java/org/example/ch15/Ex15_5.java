package org.example.ch15;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex15_5 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label lbInvestAmount = new Label("Investment Amount:");
        Label lbNumberOfYears = new Label("Number of Years:");
        Label lbAnnualInterestRate = new Label("Annual Interest Rate:");
        Label lbFutureValue = new Label("Future value:");

        TextField tfInvestAmount = new TextField();
        TextField tfNumberOfYears = new TextField();
        TextField tfAnnualInterestRate = new TextField();
        TextField tfFutureValue = new TextField();
        tfFutureValue.setEditable(false);

        Button btCalculate = new Button("Calculate");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.add(lbInvestAmount, 0, 0);
        gridPane.add(tfInvestAmount, 1, 0);
        gridPane.add(lbNumberOfYears, 0, 1);
        gridPane.add(tfNumberOfYears, 1, 1);
        gridPane.add(lbAnnualInterestRate, 0, 2);
        gridPane.add(tfAnnualInterestRate, 1, 2);
        gridPane.add(lbFutureValue, 0, 3);
        gridPane.add(tfFutureValue, 1, 3);

        gridPane.add(btCalculate, 1, 4);
        GridPane.setHalignment(btCalculate, HPos.RIGHT);

        btCalculate.setOnAction(e -> {
            double investmentAmount = Double.parseDouble(tfInvestAmount.getText());
            double annualInterestRate = Double.parseDouble(tfAnnualInterestRate.getText());
            int numberOfYears = Integer.parseInt(tfNumberOfYears.getText());

            double futureValue = investmentAmount * Math.pow((1 + (annualInterestRate / 1200)), numberOfYears * 12);
            tfFutureValue.setText(String.format("$%.2f",futureValue));
        });

        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

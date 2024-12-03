package org.example.ch15;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/*
    (Create a simple calculator) Write a program to perform addition, subtraction,
    multiplication, and division, as shown in Figure 15.27a.
*/

public class Ex15_4 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btAdd = new Button("Add");
        Button btSubtract = new Button("Subtract");
        Button btMultiply = new Button("Multiply");
        Button btDivide = new Button("Divide");

        HBox hbButtons = new HBox();
        hbButtons.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide);
        hbButtons.setAlignment(Pos.CENTER);
        hbButtons.setSpacing(5);

        Label lbNum1 = new Label("Number 1:");
        TextField tfNum1 = new TextField();
        tfNum1.setPrefColumnCount(4);
        Label lbNum2 = new Label("Number 2:");
        TextField tfNum2 = new TextField();
        tfNum2.setPrefColumnCount(4);
        Label lbRes = new Label("Result");
        TextField tfRes = new TextField();
        tfRes.setPrefColumnCount(4);
        tfRes.setEditable(false);

        HBox hbFields = new HBox();
        hbFields.getChildren().addAll(lbNum1, tfNum1, lbNum2, tfNum2, lbRes, tfRes);
        hbFields.setAlignment(Pos.CENTER);
        hbFields.setPadding(new Insets(10, 10, 10, 10));
        hbFields.setSpacing(5);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(hbFields);
        borderPane.setBottom(hbButtons);

        btAdd.setOnAction(e -> {
            double res = calculate('+',
                    Double.parseDouble(tfNum1.getText()),
                    Double.parseDouble(tfNum2.getText()));
            tfRes.setText(Double.toString(res));
        });

        btSubtract.setOnAction(e -> {
            double res = calculate('-',
                    Double.parseDouble(tfNum1.getText()),
                    Double.parseDouble(tfNum2.getText()));
            tfRes.setText(Double.toString(res));
        });

        btMultiply.setOnAction(e -> {
            double res = calculate('*',
                    Double.parseDouble(tfNum1.getText()),
                    Double.parseDouble(tfNum2.getText()));
            tfRes.setText(Double.toString(res));
        });

        btDivide.setOnAction(e -> {
            double res = calculate('/',
                    Double.parseDouble(tfNum1.getText()),
                    Double.parseDouble(tfNum2.getText()));
            tfRes.setText(Double.toString(res));
        });

        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static double calculate(char operation, double num1, double num2) {
        switch (operation) {
            case '+' -> {
                return num1 + num2;
            }
            case '-' -> {
                return num1 - num2;
            }
            case '*' -> {
                return num1 * num2;
            }
            case '/' -> {
                return num1 / num2;
            }
        }
        return Double.NaN;
    }
}
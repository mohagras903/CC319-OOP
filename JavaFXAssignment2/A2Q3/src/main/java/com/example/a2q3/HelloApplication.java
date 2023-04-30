package com.example.a2q3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage)
    {
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(5, 5, 5, 5));

        Text text1 = new Text(20, 20, "Java");
        text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text1.setRotate(90);
        pane.getChildren().add(text1);

        Text text2 = new Text(60, 60, "Java");
        text2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text2.setRotate(90);
        pane.getChildren().add(text2);

        Text text3 = new Text(10, 100, "Java");
        text3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text3.setRotate(90);
        pane.getChildren().add(text3);

        Text text4 = new Text(10, 100, "Java");
        text4.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text4.setRotate(90);
        pane.getChildren().add(text4);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowText");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
package com.example.a2q1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        try {
            GridPane pane = new GridPane();

            FileInputStream usInputStream = new FileInputStream("/Users/mohamedhagras/College/Term 6/OOP/CC319-OPP-Assignments/JavaFXAssignment2/A2Q1/images/us.gif");
            Image usa = new Image(usInputStream);
            ImageView usaImg = new ImageView(usa);

            FileInputStream ukInputStream = new FileInputStream("/Users/mohamedhagras/College/Term 6/OOP/CC319-OPP-Assignments/JavaFXAssignment2/A2Q1/images/uk.gif");
            Image uk = new Image(ukInputStream);
            ImageView ukImg = new ImageView(uk);

            FileInputStream chinaInputStream = new FileInputStream("/Users/mohamedhagras/College/Term 6/OOP/CC319-OPP-Assignments/JavaFXAssignment2/A2Q1/images/china.gif");
            Image china = new Image(chinaInputStream);
            ImageView chinaImg = new ImageView(china);

            FileInputStream caInputStream = new FileInputStream("/Users/mohamedhagras/College/Term 6/OOP/CC319-OPP-Assignments/JavaFXAssignment2/A2Q1/images/ca.gif");
            Image ca = new Image(caInputStream);
            ImageView caImg = new ImageView(ca);

            pane.setAlignment(Pos.CENTER);
            pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
            pane.setHgap(5.5);
            pane.setVgap(5.5);
            pane.add(usaImg, 0, 0);
            pane.add(ukImg, 0, 1);
            pane.add(chinaImg, 1, 0);
            pane.add(caImg, 1, 1);


            Scene scene = new Scene(pane);
            primaryStage.setTitle("ShowGridPane"); // Set the stage title

            primaryStage.setScene(scene); // Place the scene in the stage

            primaryStage.show(); // Display the stage
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
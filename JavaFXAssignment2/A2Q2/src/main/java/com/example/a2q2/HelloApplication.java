package com.example.a2q2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        try {
            GridPane pane = new GridPane();

            FileInputStream xInputStream = new FileInputStream("/Users/mohamedhagras/College/Term 6/OOP/CC319-OPP-Assignments/JavaFXAssignment2/A2Q1/images/x.gif");
            Image x = new Image(xInputStream);
            ImageView xImg = new ImageView(x);
            ImageView xImg1 = new ImageView(x);
            ImageView xImg2 = new ImageView(x);
            ImageView xImg3 = new ImageView(x);
            ImageView xImg4 = new ImageView(x);
            ImageView xImg5 = new ImageView(x);


            FileInputStream oInputStream = new FileInputStream("/Users/mohamedhagras/College/Term 6/OOP/CC319-OPP-Assignments/JavaFXAssignment2/A2Q1/images/o.gif");
            Image o = new Image(oInputStream);
            ImageView oImg = new ImageView(o);
            ImageView oImg1 = new ImageView(o);
            ImageView oImg2 = new ImageView(o);

            pane.setAlignment(Pos.CENTER);
            pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
            pane.setHgap(5.5);
            pane.setVgap(5.5);
            pane.add(xImg, 0, 0);
            pane.add(xImg1, 0, 1);
            pane.add(xImg2, 1, 0);
            pane.add(xImg3, 1, 1);
            pane.add(xImg4, 2, 1);
            pane.add(oImg, 2, 0);
            pane.add(oImg1, 0, 2);
            pane.add(oImg2, 1, 2);
            pane.add(xImg5, 2, 2);

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

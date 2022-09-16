package com.kang;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class node extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello World");
        //init location
        label.setLayoutX(100);
        label.setLayoutY(100);
        //init style background,border
        label.setStyle("-fx-background-color: pink; -fx-border-color: red; -fx-border-width: 3px");
        //taille du composant
        label.setPrefWidth(200);
        label.setPrefHeight(50);
        //location du texte
        label.setAlignment(Pos.CENTER);

        //translation
        label.setTranslateX(10);

        AnchorPane root = new AnchorPane();
        root.getChildren().add(label);
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

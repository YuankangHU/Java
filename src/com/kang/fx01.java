package com.kang;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class fx01 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage)  {
        Button button = new Button("Bilibili");

        //布局
        BorderPane borderPane = new BorderPane(button);

        button.setOnAction(event -> {
            getHostServices().showDocument("https://www.bilibili.com/");
        });

        //场景，可以切换
        Scene scene = new Scene(borderPane,300,300);

        //p为一个窗口实例
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX_HYK");
        primaryStage.show();
    }
}

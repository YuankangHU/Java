package com.kang;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class event extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root, 500, 500);

        Label label = new Label("Hello World");
        label.setLayoutX(200);
        label.setLayoutY(200);
        Button button = new Button("向上移动");
        button.setLayoutX(300);
        button.setLayoutY(200);
        root.getChildren().addAll(label,button);

        //按钮事件
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setLayoutY(label.getLayoutY() - 5);
            }
        });

        //给场景键盘事件
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                KeyCode keycode = event.getCode();
                if(keycode.equals(KeyCode.DOWN)){
                    label.setLayoutY((label.getLayoutY() + 5));
                }
            }
        });



        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

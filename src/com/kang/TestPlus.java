package com.kang;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class TestPlus extends Application {

    @Override
    public void start(Stage primaryStage){
        AnchorPane root = new AnchorPane();
        //Group root = new Group();

        Scene scene = new Scene(root, 500, 250);

        //创建菜单
        MenuBar bar = new MenuBar();
        Menu menu = new Menu(null);
        MenuItem item1 = new MenuItem("Action");
        MenuItem item2 = new MenuItem("Reset");



        menu.getItems().addAll(item1,item2);



        //创建标签和按钮
        Label label = new Label("0");
        label.setLayoutX(0);
        label.setLayoutY(100);
        label.setPrefWidth(500);
//        label.setPrefHeight(45);
        label.setAlignment(Pos.CENTER);

        Button button = new Button("+");
        button.setLayoutX(0);
        button.setLayoutY(200);
        button.setPrefWidth(500);
//        button.setPrefHeight(45);

        //监听事件
        item1.setOnAction(event -> System.out.println("Action !"));

        item2.setOnAction(event -> label.setText("0"));


        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int n = Integer.parseInt(label.getText());
                n++;
                label.setText(""+(n));
            }
        });

        //添加组件
        bar.getMenus().add(menu);
        root.getChildren().addAll(bar,label,button);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}


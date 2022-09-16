package com.kang;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;



public class TP_Picasso extends Application{
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        //设置窗口
        primaryStage.setTitle("Java Picasso 1.0");
        //布局
        Group root = new Group();


        int MAX = 10000;
        //设置随机数
        Random random = new Random();

        //创建长方形
        for (int i = 0; i < MAX; i++) {
            Rectangle rectangle = new Rectangle();
            rectangle.setX(random.nextInt(270));
            rectangle.setY(random.nextInt(270));
            rectangle.setWidth(random.nextInt(50)+20);
            rectangle.setHeight(random.nextInt(50)+20);
            Color c = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            rectangle.setFill(c);
            root.getChildren().add(rectangle);
        }


        //设置场景大小
        Scene scene = new Scene(root,300,250);
        //菜单设置
        MenuBar menuBar = new MenuBar();
        //大小与窗口绑定
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        //创建menu对象
        Menu menu = new Menu("Affichage");
        MenuItem item1 = new MenuItem("Refaire");
        MenuItem item2 = new MenuItem("Quiter");

        //添加监听事件，界面刷新
        //item1.setOnAction(event -> )


        item2.setOnAction(event -> primaryStage.close());

        menu.getItems().addAll(item1,item2);
        menuBar.getMenus().add(menu);

        //创建进度条
        ProgressBar p1 = new ProgressBar();
        p1.setLayoutY(230);
        p1.prefWidthProperty().bind(primaryStage.widthProperty());

        //添加组件到场景和窗口
        root.getChildren().addAll(menuBar,p1);
        primaryStage.setScene(scene);
        //设置窗大小固定
        primaryStage.setResizable(false);
        primaryStage.show();
    }


}

package com.kang;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TextField01 extends Application {

    @Override
    public void start(Stage primaryStage){
        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root, 500, 500);


        TextField textField = new TextField();
        textField.setLayoutX(150);
        textField.setLayoutY(200);

        //允许拖拽任何值
        textField.setOnDragOver(event -> event.acceptTransferModes(TransferMode.ANY));

        //拖拽放手，添加绝对路径
        textField.setOnDragDropped(event -> {
            Dragboard dragboard = event.getDragboard();
            if(dragboard.hasFiles()){
                String path = dragboard.getFiles().get(0).getAbsolutePath();
                textField.setText(path);

            }
        });

        root.getChildren().add(textField);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

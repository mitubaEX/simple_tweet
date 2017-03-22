package com.github.simpleTwitter.tweet;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


public class Main extends Application{
    TextField textField;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        textField = new TextField("hello");
        textField.setOnAction((ActionEvent)->{
            System.out.println(textField.getText());
            textField.setText("");
        });

        BorderPane pane = new BorderPane();
        pane.setCenter(textField);
        Scene scene = new Scene(pane, 320, 30);
        stage.setScene(scene);
        stage.show();
    }
}

package com.github.simpleTwitter.tweet;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.conf.ConfigurationBuilder;


public class Main extends Application{
    TextField textField;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        textField = new TextField();

        // ここにeventの内容を書く
        textField.setOnAction((ActionEvent)->{
            try{
                Twitter twitter = new TwitterFactory().getInstance();
                Status status = twitter.updateStatus(textField.getText());
            }catch(Exception e){
                System.out.println(e);
            }
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

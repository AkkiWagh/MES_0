package com.akki;

import com.akki.Login.LoginPage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Initialize extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("DPW MES");
        primaryStage.getIcons().add(new Image("./chat-balloon.png"));
        primaryStage.setResizable(false);
        Scene sc=LoginPage.loginScene(primaryStage);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
    
    
}

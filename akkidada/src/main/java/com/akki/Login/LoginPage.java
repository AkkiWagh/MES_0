package com.akki.Login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LoginPage {
  Stage primaryStage;

  LoginPage(Stage primaryStage) {
    this.primaryStage = primaryStage;

  }

  public static Scene loginScene(Stage primaryStage) {
    LoginPage obj = new LoginPage(primaryStage);

    Label loginName = new Label("Login");
    loginName.setStyle("-fx-font-weight:bold;-fx-text-fill:White;-fx-font-size:15");
    VBox vb1 = new VBox(loginName);
    vb1.setMaxWidth(420);
    vb1.setMinHeight(30);
    vb1.setPadding(new Insets(5, 0, 0, 15));
    vb1.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));

    Label username = new Label("User Name*");
    username.setStyle("-fx-font-weight:bold");
    TextField userNameField = new TextField();
    userNameField.setMaxWidth(400);
    userNameField.setMinHeight(30);

    Label password = new Label("Password*");
    password.setStyle("-fx-font-weight:bold");
    PasswordField passwordField = new PasswordField();
    passwordField.setMinHeight(30);
    passwordField.setMaxWidth(400);
    ;
    Button login = new Button("Login");
    VBox vb2 = new VBox(5, username, userNameField, password, passwordField);
    vb2.setPadding(new Insets(0, 0, 0, 440));

    login.setStyle("-fx-background-color:Red;-fx-text-fill:White;-fx-font-weight:bold");
    VBox vb3 = new VBox(login);
    login.setMinHeight(30);
    login.setMinWidth(100);
    vb3.setPadding(new Insets(0, 0, 0, 740));
    VBox mainBox = new VBox(10, vb1, vb2, vb3);
    mainBox.setStyle("-fx-border-fill:Red;-fx-font-size:14;-fx-border-color:red");
    mainBox.setAlignment(Pos.CENTER);

    Scene scene = new Scene(mainBox, 1270, 620);
    return scene;

  }
}

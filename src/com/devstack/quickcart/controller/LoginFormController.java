package com.devstack.quickcart.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginFormController {
    public TextField emailTxt;
    public TextField passwordTxt;
    public AnchorPane container;

    public void showPswd(ActionEvent actionEvent) {
    }

    public void forgotPswd(MouseEvent mouseEvent) {
        URL resource = getClass().getResource("../view/ForgotPassword.fxml");
        Parent parent = null;
        try {
            parent = FXMLLoader.load(resource);
            Scene scene = new Scene(parent);
            Stage stage = (Stage) container.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Forgot Password");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void loginBtn(ActionEvent actionEvent) {

    }
}

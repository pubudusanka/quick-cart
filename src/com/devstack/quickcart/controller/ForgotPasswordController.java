package com.devstack.quickcart.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ForgotPasswordController {
    public AnchorPane container;

    public void sendReqCode(ActionEvent actionEvent) {
        URL resource = getClass().getResource("../view/VerifyEmail.fxml");
        Parent parent = null;
        try {
            parent = FXMLLoader.load(resource);
            Scene scene = new Scene(parent);
            Stage stage = (Stage) container.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Verify Email");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

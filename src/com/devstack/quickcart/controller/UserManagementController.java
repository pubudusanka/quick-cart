package com.devstack.quickcart.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class UserManagementController {
    public AnchorPane container;
    public TextField txtDisplayName;
    public TextField txtDisplayEmail;
    public TableView tblUserDetail;

    private void setUi(String location) {
        URL resource = getClass().getResource("../view/" + location + ".fxml");
        Parent parent = null;
        try {
            parent = FXMLLoader.load(resource);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene scene = new Scene(parent);
        Stage stage = (Stage) container.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle(location);
        stage.show();
    }

    public void userBackButton(MouseEvent mouseEvent) {
        setUi("Dashboard");
    }

    public void btnAddUser(ActionEvent actionEvent) {
    }

    public void btnSaveUser(ActionEvent actionEvent) {
    }
}

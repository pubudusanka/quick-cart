package com.devstack.quickcart.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class CustomerManagementController {
    public TextField txtCustName;
    public TextField txtCustNic;
    public TextField txtCustSalary;
    public TextArea txtCustAddress;
    public TableView tblCustDetail;
    public AnchorPane container;

    public void btnAddCustomer(ActionEvent actionEvent) {
    }

    public void btnSaveCust(ActionEvent actionEvent) {
    }

    public void custBackButton(MouseEvent mouseEvent) {
        setUi("Dashboard");
    }

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
}

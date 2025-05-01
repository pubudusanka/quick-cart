package com.devstack.quickcart.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class DashboardController {
    public AnchorPane custManage;
    public AnchorPane productManage;
    public AnchorPane statistics;
    public AnchorPane userManage;
    public AnchorPane orderManage;
    public AnchorPane activityConsole;
    public AnchorPane loyaltyProgram;
    public AnchorPane settings;
    public AnchorPane container;

    public void pressedCustMng(MouseEvent mouseEvent) {
        setUi("CustomerManagement");
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

    public void pressedProductMng(MouseEvent mouseEvent) {
        setUi("ProductManagement");
    }

    public void pressedStatMng(MouseEvent mouseEvent) {
        setUi("Statistics");
    }

    public void pressedUserMng(MouseEvent mouseEvent) {
        setUi("UserManagement");
    }

    public void pressedOrderMng(MouseEvent mouseEvent) {
        setUi("OrderManagement");
    }

    public void pressedActivityConsole(MouseEvent mouseEvent) {
        setUi("ActivityLog");
    }
}

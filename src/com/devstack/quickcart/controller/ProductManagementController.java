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

public class ProductManagementController {
    public AnchorPane container;
    public TextField txtProductName;
    public TextField txtProductDesc;
    public TextField txtProductQty;
    public TableView tblProductDetail;
    public TextField txtProductUnitPrice;
    public AnchorPane productImage;

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

    public void btnAddProduct(ActionEvent actionEvent) {
    }

    public void btnSaveProduct(ActionEvent actionEvent) {
    }

    public void btnAddProductImage(ActionEvent actionEvent) {
    }

    public void productBackButton(MouseEvent mouseEvent) {
        setUi("Dashboard");
    }
}

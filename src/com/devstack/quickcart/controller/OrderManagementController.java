package com.devstack.quickcart.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class OrderManagementController {
    public AnchorPane container;
    public TextField txtCustName;
    public TextField txtCustSalary;
    public TableView tblCustDetail;
    public ComboBox custIdCombo;
    public TextField txtCustAddr;
    public TextField txtProductDesc;
    public TextField txtProductUnitPrice;
    public ComboBox productIdCombo;
    public TextField txtProductQty;
    public TextField txtReqQty;
    public Label txtGrossAmount;
    public Label txtTax;
    public Label txtDiscount;
    public Label txtNetAmount;
    public CheckBox checkBuyStatus;

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

    public void custBackButton(MouseEvent mouseEvent) {
        setUi("Dashboard");
    }

    public void btnPlaceOrder(ActionEvent actionEvent) {
    }

    public void btnAddCart(ActionEvent actionEvent) {
    }
}

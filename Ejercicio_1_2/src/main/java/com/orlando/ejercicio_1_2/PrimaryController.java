package com.orlando.ejercicio_1_2;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtDinero;
    @FXML
    private TextField txt500;
    @FXML
    private TextField txt200;
    @FXML
    private TextField txt100;
    @FXML
    private TextField txt50;
    @FXML
    private TextField txt20;
    @FXML
    private TextField txt10;
    @FXML
    private TextField txt5;
    @FXML
    private TextField txt2;
    @FXML
    private TextField txt1;

    @FXML
    public void desglosar(ActionEvent event) {
        int total = Integer.parseInt(txtDinero.getText());
        int b500 = total / 500;
        total = total % 500;
        int b200 = total / 200;
        total = total % 200;
        int b100 = total / 100;
        total = total % 100;
        int b50 = total / 50;
        total = total % 50;
        int b20 = total / 20;
        total = total % 20;
        int m10 = total / 10;
        total = total % 10;
        int m5 = total / 5;
        total = total % 5;
        int m2 = total / 2;
        total = total % 2;
        int m1 = total;

        txt1.setText("" + m1);
        txt10.setText("" + m10);
        txt100.setText("" + b100);
        txt2.setText("" + m2);
        txt20.setText("" + b20);
        txt200.setText("" + b200);
        txt5.setText("" + m5);
        txt50.setText("" + b50);
        txt500.setText("" + b500);
    }

    @FXML

    public void limpiar() {
        
        txt1.setText("");
        txt10.setText("");
        txt100.setText("");
        txt2.setText("");
        txt20.setText("");
        txt200.setText("");
        txt5.setText("");
        txt50.setText("");
        txt500.setText("");
        txtDinero.setText("");
    }
}

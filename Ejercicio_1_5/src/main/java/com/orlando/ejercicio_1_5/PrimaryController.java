package com.orlando.ejercicio_1_5;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TextField txtTotal;
    @FXML private TextField txtAlim;
    @FXML private TextField txtRefrig;
    @FXML private TextField txtTelf;
    @FXML private TextField txtOtros;
    @FXML private TextField txtAlto;
    @FXML private TextField txtTransp;

    @FXML
    private void calcilar(ActionEvent event) {
        int alimen=Integer.parseInt(txtAlim.getText()), refrig=Integer.parseInt(txtRefrig.getText()), telef=Integer.parseInt(txtTelf.getText()), otros=Integer.parseInt(txtOtros.getText()), transp=Integer.parseInt(txtTransp.getText());
        int total=alimen+otros+refrig+telef+transp;
        String alto="";
        if (alimen>=refrig && alimen>=transp && alimen>=telef && alimen>=otros){
            alto="Alimentacion";
        }else if(refrig>=alimen && refrig>=transp && refrig>=telef && refrig>=otros){
            alto="refrig";
        }else if(transp>=alimen && transp>=refrig && transp>=telef && transp>=otros){
            alto="transp";
        }else if(telef>=alimen && telef>=refrig && telef>=transp && telef>=otros){
            alto="telef";
        }else{
            alto="Otros";
        }

        txtAlto.setText(alto);
        txtTotal.setText(""+total);
    }
    
    @FXML 
    void limpiar(ActionEvent event){
        txtAlim.setText("");
        txtAlto.setText("");
        txtOtros.setText("");
        txtRefrig.setText("");
        txtTelf.setText("");
        txtTotal.setText("");
        txtTransp.setText("");
    }
}

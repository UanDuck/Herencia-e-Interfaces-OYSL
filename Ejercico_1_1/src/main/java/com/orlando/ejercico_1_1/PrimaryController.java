package com.orlando.ejercico_1_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML private TextField txtFecha;
    @FXML private Label txtRes;
    
    @FXML
    private void calcular(ActionEvent event) {
        
        String fecha=txtFecha.getText();
        //usamos split, un metodo o libreria para separar por partes un texto
        String[] partes = fecha.split("/");
        int diaN = Integer.parseInt(partes[0]);
        int mesN = Integer.parseInt(partes[1]);
        int anioN = Integer.parseInt(partes[2]);
        
        //fechas actuales
        int diaH=18;
        int mesH=10;
        int anioH=2026;
        
        //calculamos
        int anios=anioH-anioN;
        int meses=mesH-mesN;
        if(meses<0){
            anios=-1;
            meses=+12;
        }
        
        txtRes.setText("Tienes "+anios+" años y "+meses+" meses");
    }
    
    public void limpiar(){
        txtFecha.setText("");
        txtRes.setText("");
    }
}//clas primarycontroller

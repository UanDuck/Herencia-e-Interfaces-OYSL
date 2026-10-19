package com.orlando.ejercicio_1_4;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TextField txtNumero;
    @FXML private Label txtTabla;
    
    @FXML
    private void calcular(ActionEvent event) {
        int res=0, num=Integer.parseInt(txtNumero.getText());
        String tabla="";
        for(int i=1;i<=10;i++){
            res=num*i; 
            tabla+=num+" x "+i+" = "+res+"\n";
        }
        txtTabla.setText(tabla);
        
    }//calcular
    
    
    @FXML
    public void limpiar(){
        txtNumero.setText("");
        txtTabla.setText("");
    }
    
}//primary controller

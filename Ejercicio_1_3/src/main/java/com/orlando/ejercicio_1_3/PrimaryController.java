package com.orlando.ejercicio_1_3;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TextField txtNum;
    @FXML private TextField txtCantidad;
    @FXML private TextField txtImpares;
    @FXML private TextField txtPares;
    @FXML private TextField txtMayor;
    @FXML private TextField txtMenor;
    @FXML private TextField txtTotal;
    @FXML private Label txtDivisores;
    
    @FXML
    private void analizar(ActionEvent event){
         String numtexto=txtNum.getText();
    int num=Integer.parseInt(numtexto);
    int cantidad=numtexto.length();
    int pares=0,impares=0,mayor=-1,menor=10,total=0,i=0,temp=num;
    String divisores = "";
    //guardo el largo de la cadena para tener la cantidad de digitos e inicializo las otras variables
    
    while(temp>0){
    int digito= temp %10;
    total+=digito;
    
        if(digito % 2 == 0){
            pares+=digito;
        }else{
            impares+=digito;
        }
        
        if(digito>mayor){
            mayor=digito;
        }
        
        if(digito<menor){
            menor=digito;
        }
       temp=temp/10;
    }//whiel
    
    //para calcular los divisorers
    for(i=1;i<=num;i++){
        if(num % i ==0){
            divisores+=i+"\n";
        }
    }
    
    
    txtCantidad.setText(""+cantidad);
    txtDivisores.setText(divisores);
    txtMayor.setText(""+mayor);
    txtMenor.setText(""+menor);
    txtPares.setText(""+pares);
    txtImpares.setText(""+impares);
    txtTotal.setText(""+total);
    }//metodo analizar
    
    @FXML
    public void limpiar(){
        txtCantidad.setText("");
        txtDivisores.setText("");
        txtMayor.setText("");
        txtMenor.setText("");
        txtNum.setText("");
        txtPares.setText("");
        txtTotal.setText("");
        txtImpares.setText("");
    }//limppiae
}
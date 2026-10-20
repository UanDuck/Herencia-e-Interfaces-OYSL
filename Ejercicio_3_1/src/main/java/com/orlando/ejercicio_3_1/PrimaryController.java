package com.orlando.ejercicio_3_1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtContar;
    @FXML private ProgressBar ProgressBar; 
    @FXML private Button btnContar;
    @FXML private Button btnEsperar;

    int click = 0;

    @FXML
    public void contar(ActionEvent event) {
        click++;
        txtContar.setText("" + click);
    }

    @FXML
    public void esperar(ActionEvent event) {
        btnEsperar.setDisable(true);//deshabilitamos los botones
        btnContar.setDisable(true);
        ProgressBar.setProgress(0);//e iniciamos la progressbar en 0

        
        new Thread(() -> {
            try{
                for (int i = 1; i <= 100; i++) { 
                    Thread.sleep(100); 
                    double progreso=i/100.0; 
                    
                    Platform.runLater(() -> {//actualizamos la barra de progreso   tambien usamos platform runalater porque invoker es antigua de java swing
                        ProgressBar.setProgress(progreso);
                    });
                }//for
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally{
                Platform.runLater(() -> {
                    btnEsperar.setDisable(false);//al terminar, vovlemos a habilitar el bton
                    btnContar.setDisable(false);
                });
            }
        }).start();
    }
}
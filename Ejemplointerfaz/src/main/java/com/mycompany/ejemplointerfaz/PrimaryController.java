package com.mycompany.ejemplointerfaz;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class PrimaryController implements Initializable{
    @FXML private TextArea txtPersona;
    @FXML private TextArea txtConsola;
    @FXML private TextArea txtTv;
    
    Persona p;
    Consola c;
    Television t;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       p = new Persona("orlando", 19);
       txtPersona.setText(p.toString());
       c = new Consola("laptop", "Hp");
       txtConsola.setText(c.toString());
       t = new Television("Hp", 16, "China");
       txtTv.setText(t.toString());
    }
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

}

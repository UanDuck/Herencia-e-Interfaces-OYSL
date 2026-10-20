package com.orlando.ejercicio_3_2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController {

    @FXML private Button btnCorrer;
    @FXML private Label txtLiebre;
    @FXML private ProgressBar ProgressLiebre;
    @FXML private Label txtTortuga;
    @FXML private ProgressBar ProgressTortuga;

    boolean LiebreGana=false;
    boolean TrotugaGana=false;

    @FXML
    public void correr(ActionEvent event) {
        btnCorrer.setDisable(true);
        ProgressLiebre.setProgress(0);
        ProgressTortuga.setProgress(0);
        LiebreGana=false;
        TrotugaGana=false;
        //inicioamos todo desde 0
        
        
        ///////     para la tortuga  ////////
        Thread Thread_Tortuga = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            txtTortuga.setText("La Tortuga: esta caminando¡¡");
                        }
                    });
                    
                    
                    for (int i=1;i<=100;i++) {
                        Thread.sleep(120); 
                        double progreso=i/100.0;
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                ProgressTortuga.setProgress(progreso);
                            }
                        });
                    }//for
                    
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            txtTortuga.setText("La Tortuga: 🏁 Llego!!");
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    TrotugaGana=true;
                    finCarrera();
                }
            }
        });

        ////////  Conejo  //////////7
        Thread ThreadLiebre = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            txtLiebre.setText("La Liebre: esta corriendo¡");
                        }
                    });
                    int random1=(int) (Math.random()*100)+1;//un numero random para dormir a la liebre xD
                    
                    for(int i=1;i<=100;i++){
                        Thread.sleep(82); 
                        if(i==random1){
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    txtLiebre.setText("La Liebre: se durmio :( ");
                                }
                            });
                            
                            
                            Thread.sleep(5000); 
                            
                            Platform.runLater(new Runnable(){
                                @Override
                                public void run() {
                                    txtLiebre.setText("La Liebre: desperta y empieza a correr¡¡¡");
                                }
                            });
                        }//if

                        double progreso=i/100.0;
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                ProgressLiebre.setProgress(progreso);
                            }
                        });
                    }//for
                    
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            txtLiebre.setText("La Liebre: Llego a la meta 🏁");
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    LiebreGana = true;
                    finCarrera();
                }
            }
        });

        Thread_Tortuga.start();
        ThreadLiebre.start();
    }

    
    
    public void finCarrera() {
        if (LiebreGana && TrotugaGana) {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    btnCorrer.setDisable(false);
                }
            });
        }
    }
}
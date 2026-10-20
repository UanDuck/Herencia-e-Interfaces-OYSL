
package com.orlando.ejercicio_2_1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {

   // private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
     /*   scene = new Scene(loadFXML("primary"), 420, 240);
        stage.setScene(scene);
        stage.show();*/
    }
/*
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }*/

    public static void main(String[] args) {
        Alumno a=new Alumno();
        Profesor p=new Profesor(10008000);
        System.out.println(a);
        System.out.println(p);
    }

}

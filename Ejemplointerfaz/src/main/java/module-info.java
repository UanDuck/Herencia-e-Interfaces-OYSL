module com.mycompany.ejemplointerfaz {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejemplointerfaz to javafx.fxml;
    exports com.mycompany.ejemplointerfaz;
}

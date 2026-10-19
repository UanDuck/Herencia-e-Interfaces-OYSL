module com.orlando.ejercicio_1_5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.orlando.ejercicio_1_5 to javafx.fxml;
    exports com.orlando.ejercicio_1_5;
}

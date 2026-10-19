module com.orlando.ejercicio_1_3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.orlando.ejercicio_1_3 to javafx.fxml;
    exports com.orlando.ejercicio_1_3;
}

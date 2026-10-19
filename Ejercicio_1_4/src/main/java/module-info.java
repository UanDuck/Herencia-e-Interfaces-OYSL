module com.orlando.ejercicio_1_4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.orlando.ejercicio_1_4 to javafx.fxml;
    exports com.orlando.ejercicio_1_4;
}

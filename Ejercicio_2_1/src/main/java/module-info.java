module com.orlando.ejercicio_2_1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.orlando.ejercicio_2_1 to javafx.fxml;
    exports com.orlando.ejercicio_2_1;
}

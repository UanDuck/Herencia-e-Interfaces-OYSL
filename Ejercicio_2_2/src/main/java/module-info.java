module com.orlando.ejercicio_2_2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.orlando.ejercicio_2_2 to javafx.fxml;
    exports com.orlando.ejercicio_2_2;
}

module com.example.queah {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.queah to javafx.fxml;
    exports com.example.queah;
}
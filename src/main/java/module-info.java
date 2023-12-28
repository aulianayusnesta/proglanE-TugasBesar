module com.example.tugasbesar {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.tugasbesar to javafx.fxml;
    exports com.example.tugasbesar;
}
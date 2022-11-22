module com.example.miles {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.miles to javafx.fxml;
    exports com.example.miles;
}
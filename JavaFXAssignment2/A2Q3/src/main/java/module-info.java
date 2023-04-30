module com.example.a2q3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.a2q3 to javafx.fxml;
    exports com.example.a2q3;
}
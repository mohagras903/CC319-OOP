module com.example.a2q1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.a2q1 to javafx.fxml;
    exports com.example.a2q1;
}
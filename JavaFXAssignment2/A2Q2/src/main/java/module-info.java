module com.example.a2q2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.a2q2 to javafx.fxml;
    exports com.example.a2q2;
}
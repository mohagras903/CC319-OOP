module com.example.javafxassignment1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxassignment1 to javafx.fxml;
    exports com.example.javafxassignment1;
}
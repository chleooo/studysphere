module com.example.studysphere {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studysphere to javafx.fxml;
    exports com.example.studysphere;
}
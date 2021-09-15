module com.example.depressedknocker {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.depressedknocker to javafx.fxml;
    exports com.example.depressedknocker;
}
module com.escola {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.escola to javafx.fxml;
    exports com.escola;
}

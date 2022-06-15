module com.example.bankinglibraryinterface {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.bankinglibraryinterface to javafx.fxml;
    exports com.example.bankinglibraryinterface;
}
module com.example.mycontacts {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.mycontacts to javafx.fxml;
    opens com.example.mycontacts.datamodel to javafx.fxml;

    exports com.example.mycontacts;
    exports com.example.mycontacts.datamodel;
}
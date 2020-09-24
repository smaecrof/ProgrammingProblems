module MyContacts {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.base;
    requires java.xml;

    opens sample;
    opens sample.datamodel;
}
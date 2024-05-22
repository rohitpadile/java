module sample.events {
    requires javafx.controls;
    requires javafx.fxml;

    requires net.synedra.validatorfx;

    opens sample.events to javafx.fxml;
    exports sample.events;
}
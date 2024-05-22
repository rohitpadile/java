module sample.layouts {
    requires javafx.controls;
    requires javafx.fxml;

    requires net.synedra.validatorfx;

    opens sample.layouts to javafx.fxml;
    exports sample.layouts;
}
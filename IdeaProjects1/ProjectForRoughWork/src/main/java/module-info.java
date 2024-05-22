module sample.projectforroughwork {
    requires javafx.controls;
    requires javafx.fxml;

    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens sample.projectforroughwork to javafx.fxml;
    exports sample.projectforroughwork;
}
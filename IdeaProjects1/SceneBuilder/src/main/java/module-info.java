module sample.scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;

    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens sample.scenebuilder to javafx.fxml;
    exports sample.scenebuilder;
}
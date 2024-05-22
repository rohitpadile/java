module com.rohitpadile.csswithjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.rohitpadile.csswithjavafx to javafx.fxml;
    exports com.rohitpadile.csswithjavafx;
}
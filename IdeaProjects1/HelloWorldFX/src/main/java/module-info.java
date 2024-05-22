module com.example.helloworldfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires net.synedra.validatorfx;

    opens com.example.helloworldfx to javafx.fxml;
    exports com.example.helloworldfx;
}
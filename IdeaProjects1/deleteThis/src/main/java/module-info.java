module com.example.deletethis {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.deletethis to javafx.fxml;
    exports com.example.deletethis;
}
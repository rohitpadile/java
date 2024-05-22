module sample.todolist {
    requires javafx.controls;
    requires javafx.fxml;

    requires net.synedra.validatorfx;

    opens com.rohitPadile.todoList to javafx.fxml;
    exports com.rohitPadile.todoList;
}
module co.edu.uniquindio.unievntos {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.unievntos to javafx.fxml;
    exports co.edu.uniquindio.unievntos;
}
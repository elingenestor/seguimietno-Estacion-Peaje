module co.edu.uniquindio.estacionpeaje {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.estacionpeaje to javafx.fxml;
    exports co.edu.uniquindio.estacionpeaje;
}
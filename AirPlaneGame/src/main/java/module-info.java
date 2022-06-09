module com.example.airplanegame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.airplanegame to javafx.fxml;
    exports com.example.airplanegame;
}
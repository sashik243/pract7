module ru.polkovnikova.pagetopage {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.polkovnikova.pagetopage to javafx.fxml;
    exports ru.polkovnikova.pagetopage;
    exports ru.polkovnikova.pagetopage.controller;
    opens ru.polkovnikova.pagetopage.controller to javafx.fxml;
}
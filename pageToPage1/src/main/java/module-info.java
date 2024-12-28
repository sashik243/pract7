module ru.polkovnikova.pagetopage1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.pagetopage1 to javafx.fxml;
    exports ru.polkovnikova.pagetopage1;
    exports ru.polkovnikova.pagetopage1.controller;
    opens ru.polkovnikova.pagetopage1.controller to javafx.fxml;
}
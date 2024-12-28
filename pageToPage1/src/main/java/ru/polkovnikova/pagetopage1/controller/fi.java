package ru.polkovnikova.pagetopage1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.polkovnikova.pagetopage1.util.Manager.showSecondScene;

public class fi {

    @FXML
    private Button BackB;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("helo-view.fxml","Marathon Skills 2016");
    }

}

package ru.polkovnikova.pagetopage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import static ru.polkovnikova.pagetopage.util.Manager.showSecondStage;

public class SecondController {

    @FXML
    void goButtonOnAction(ActionEvent event) {

            showSecondStage("hello-view.fxml","Marathon Skills 2016");
    }

}

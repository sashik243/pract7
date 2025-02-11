package ru.polkovnikova.pagetopage1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.polkovnikova.pagetopage1.util.Manager.*;

public class Dva {

    @FXML
    private Button BackB;

    @FXML
    private Button Login;

    @FXML
    private Button NewB;

    @FXML
    private Button OldB;

    @FXML
    void BackB(ActionEvent event) {

        showSecondScene("helo-view.fxml", "Marathon Skills 2016");
    }

    @FXML
    void Login(ActionEvent event) {
        showTriScene("tri.fxml","Marathon Skills 2016 - Login");
    }

    @FXML
    void NewB(ActionEvent event) {
        showChScene("q.fxml","Marathon Skills 2016 – Register as a runner");
    }

    @FXML
    void OldB(ActionEvent event) {
        showChScene("Tri.fxml","Marathon Skills 2016 – Register as a runner");
    }

}

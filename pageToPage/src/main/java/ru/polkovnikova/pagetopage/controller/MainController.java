package ru.polkovnikova.pagetopage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.polkovnikova.pagetopage.util.Manager.showSecondStage;

public class MainController implements Initializable {

    @FXML
    private Button goButton;

    @FXML
    void goButtonOnAction(ActionEvent event) {

        showSecondStage("go-view.fxml", "Marathon Skills 2016 - Registr as a runner");
        }

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            goButton.setStyle("-fx-bakground-color:#20B2AA; -fx-bakground-radius: 5px; -fx-text-fill:#ffffff");
        }
    }



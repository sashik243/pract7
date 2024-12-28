package ru.polkovnikova.pagetopage1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static ru.polkovnikova.pagetopage1.util.Manager.showMainStage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        showMainStage(stage,"helo-view.fxml","Marathor Skills 2016");

    }

    public static void main(String[] args) {
        launch();
    }
}
package com.example.bankinglibraryinterface;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Scene scene;
    private BorderPane borderPane;
    private static TopPane topPane;
    private static RightPane rightPane;
    private static CenterPane centerPane;


    @Override
    public void start(Stage stage) throws IOException {
        createScene();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private void createScene()
    {
        topPane = new TopPane();
        rightPane = new RightPane();
        centerPane = new CenterPane();
        borderPane = new BorderPane();
        borderPane.setTop(topPane.getPane());
        borderPane.setRight(rightPane.getPane());
        borderPane.setCenter(centerPane.getPane());

        scene = new Scene(borderPane, GlobalManager.getSCREEN_WIDTH(), GlobalManager.getSCREEN_HEIGHT());
    }

    public static TopPane getTopPane() {
        return topPane;
    }

    public static RightPane getRightPane() {
        return rightPane;
    }

    public static CenterPane getCenterPane() {
        return centerPane;
    }
}

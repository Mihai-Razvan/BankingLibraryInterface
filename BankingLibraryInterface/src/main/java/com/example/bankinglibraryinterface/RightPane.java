package com.example.bankinglibraryinterface;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class RightPane {

    private final Pane pane;

    public RightPane()
    {
        pane = new Pane();
        pane.setPrefSize(GlobalManager.getSCREEN_WIDTH() / 5, GlobalManager.getSCREEN_HEIGHT() / 9);
        pane.setBackground(new Background(new BackgroundFill(Color.valueOf("CACCCB"), CornerRadii.EMPTY, Insets.EMPTY)));
    }

    public Pane getPane()
    {
        return pane;
    }
}

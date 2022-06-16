package com.example.bankinglibraryinterface;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class TopPane {

    private final Pane pane;
    Button addButton;

    public TopPane()
    {
        pane = new Pane();
        pane.setPrefSize(GlobalManager.getSCREEN_WIDTH(), GlobalManager.getSCREEN_HEIGHT() / 10);
        pane.setBackground(new Background(new BackgroundFill(Color.valueOf("E3E3E3"), CornerRadii.EMPTY, Insets.EMPTY)));

        addButton = new Button("Add card");

        pane.getChildren().add(addButton);

        addButtonOnClick();
    }

    private void addButtonOnClick()
    {
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Main.getCenterPane().setAddCardPaneVisibility(true);
            }
        });
    }

    public Pane getPane()
    {
        return pane;
    }
}

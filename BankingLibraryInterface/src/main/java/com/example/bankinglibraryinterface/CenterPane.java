package com.example.bankinglibraryinterface;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;


public class CenterPane {

    private final Pane pane;
    private Pane addCardPane;
    private TextField addCardNumberTF;
    private TextField addCardExpirationTF;
    private TextField addCardCvvTF;
    private Button addCardButton;

    public CenterPane()
    {
        pane = new Pane();
        pane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        pane.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        setAddCardPane();
        addCardPane.setVisible(false);
        pane.getChildren().add(addCardPane);
    }

    private void setAddCardPane()
    {
        addCardPane = new Pane();
        addCardNumberTF = new TextField();
        addCardExpirationTF = new TextField();
        addCardCvvTF = new TextField();
        addCardButton = new Button("Add");

        Platform.runLater(() -> {  //we use this so addCardPane.getWidth won't be 0 and will be its actual width, platform.runLater happens after stage is shown so after the siezes of elements are done
            addCardPane.setLayoutX(GlobalManager.getSCREEN_WIDTH() / 2 - addCardPane.getWidth() / 2);
            addCardPane.setLayoutY(GlobalManager.getSCREEN_HEIGHT() / 2 - addCardPane.getHeight() / 2);
            addCardPane.setPrefWidth(addCardNumberTF.getWidth() + 50);

            addCardNumberTF.setLayoutX(addCardNumberTF.getLayoutX() + 25);
            addCardExpirationTF.setLayoutX(addCardExpirationTF.getLayoutX() + 25);
            addCardCvvTF.setLayoutX(addCardCvvTF.getLayoutX() + 25);
            addCardExpirationTF.setLayoutY(addCardNumberTF.getLayoutY() + 50);
            addCardCvvTF.setLayoutY(addCardExpirationTF.getLayoutY() + 50);
        });
        addCardPane.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        addCardPane.setBackground(new Background(new BackgroundFill(Color.valueOf("E3E3E3"), CornerRadii.EMPTY, Insets.EMPTY)));

        addCardPane.getChildren().addAll(addCardNumberTF, addCardExpirationTF, addCardCvvTF);
    }

    private void addCardButtonOnClick()
    {
        addCardButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String cardNumber = addCardNumberTF.getText().toString().trim();
                String cardExpiration = addCardExpirationTF.getText().toString().trim();
                String cvv = addCardCvvTF.getText().toString().trim();

            }
        });
    }

    public Pane getPane()
    {
        return pane;
    }

    public void setAddCardPaneVisibility(boolean visibility)
    {
        addCardPane.setVisible(visibility);
    }
}

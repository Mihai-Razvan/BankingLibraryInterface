import com.BankingLibrary.Bank;
import com.BankingLibrary.Card;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CenterPanel {

    private Panel panel;

    private Panel addCardPanel;
    private TextField addCardNumberTF;
    private TextField addCardCVVTF;
    private TextField addCardExpirationTF;
    private TextField addCardSoldTF;
    private Button addCardButton;
    private Button addCardXButton;
    private Panel cardsPanel;

    private ArrayList<Card> cardsList;

    public CenterPanel(int frameWidth, int frameHeight)
    {
        panel = new Panel();
        panel.setBackground(Color.yellow);
        panel.setBounds(0, frameHeight / 10, frameWidth / 5 * 4, frameHeight / 10 * 9);
        panel.setLayout(null);

        setAddCardPanel();
        setCardsPanel();

        cardsList = new ArrayList<>();
    }

    private void setAddCardPanel()
    {
        addCardPanel = new Panel();
        addCardPanel.setBounds(100, 100, 200, 200);
        addCardPanel.setBackground(Color.pink);

        addCardNumberTF = new TextField();
        addCardCVVTF = new TextField();
        addCardExpirationTF = new TextField();
        addCardSoldTF = new TextField();
        addCardButton = new Button("Add");
        addCardXButton = new Button("X");
        addCardXButton.setBounds(180, 0, 20, 20);

        addCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cardNumber = addCardNumberTF.getText().toString().trim();
                String cvv = addCardCVVTF.getText().toString().trim();
                String expiration = addCardExpirationTF.getText().toString().trim();
                float sold = Float.parseFloat(addCardSoldTF.getText().toString().trim());
                Bank.addCard(cardNumber, cvv, expiration);   //check if card already exists/ this should be done in the library
                addCard(new Card(cardNumber, cvv, expiration, sold));
                addCardPanel.setVisible(false);
            }
        });

        addCardXButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCardPanel.setVisible(false);
            }
        });

        addCardPanel.add(addCardXButton);
        addCardPanel.add(addCardNumberTF);
        addCardPanel.add(addCardCVVTF);
        addCardPanel.add(addCardExpirationTF);
        addCardPanel.add(addCardSoldTF);
        addCardPanel.add(addCardButton);

        addCardPanel.setLayout(new BoxLayout(addCardPanel, BoxLayout.Y_AXIS));
        addCardPanel.setVisible(false);

        panel.add(addCardPanel);
    }

    private void setCardsPanel()
    {
        cardsPanel = new Panel();
        cardsPanel.setBounds(50, 50, 500, 200);
        cardsPanel.setBackground(Color.green);

        Panel p = new Panel();
        p.setBackground(Color.black);
        cardsPanel.add(p);
        p.setLayout(null);

      //  cardsPanel.setLayout(new BoxLayout(cardsPanel, BoxLayout.Y_AXIS));
        cardsPanel.setLayout(null);
        panel.add(cardsPanel);
    }

    public Panel getPanel() {
        return panel;
    }

    public void setAddCardPanelVisibility(boolean visibility)
    {
        addCardPanel.setVisible(visibility);
    }

    public void addCard(Card card)
    {
        cardsList.add(card);
        Panel cardPanel = new Panel();
        Label numberLabel = new Label(card.getCardNumber());
        Label cvvLabel = new Label(card.getCvv());
        Label expirationLabel = new Label(card.getExpirationDate());

        cardPanel.add(numberLabel);
        cardPanel.add(cvvLabel);
        cardPanel.add(expirationLabel);

       // cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.X_AXIS));
        cardPanel.setLayout(null);
        cardsPanel.add(cardPanel);
    }
}

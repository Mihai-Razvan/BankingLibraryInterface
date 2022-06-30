import com.BankingLibrary.Bank;
import com.BankingLibrary.BankingExistingCardException;
import com.BankingLibrary.Card;
import com.mongodb.MongoException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCardPanel {

    private JPanel addCardPanel;
    private JTextField addCardNumberTF;
    private JTextField addCardCVVTF;
    private JTextField addCardExpirationTF;
    private JTextField addCardSoldTF;
    private JButton addCardAddButton;
    private JButton addCardXButton;

    public AddCardPanel(int frameWidth, int frameHeight)
    {
        addCardPanel = new JPanel();
        addCardPanel.setBounds(frameWidth / 2 - 100, 100, 200, 200);
        addCardPanel.setBackground(new Color(240, 240, 240, 94));
        addCardPanel.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.black));

        addCardNumberTF = new JTextField();
        addCardCVVTF = new JTextField();
        addCardExpirationTF = new JTextField();
        addCardSoldTF = new JTextField();
        addCardAddButton = new JButton("Add");
        addCardXButton = new JButton("X");
        addCardXButton.setBounds(180, 0, 20, 20);

        setListeners();

        addCardPanel.add(addCardXButton);
        addCardPanel.add(addCardNumberTF);
        addCardPanel.add(addCardCVVTF);
        addCardPanel.add(addCardExpirationTF);
        addCardPanel.add(addCardSoldTF);
        addCardPanel.add(addCardAddButton);

        addCardPanel.setLayout(new BoxLayout(addCardPanel, BoxLayout.Y_AXIS));

        addCardPanel.setVisible(false);
    }

    private void setListeners()
    {
        addCardAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String cardNumber = addCardNumberTF.getText().toString().trim();
                String cvv = addCardCVVTF.getText().toString().trim();
                String expiration = addCardExpirationTF.getText().toString().trim();
                float sold = Float.parseFloat(addCardSoldTF.getText().toString().trim());

                try {
                    Bank.addCard(cardNumber, cvv, expiration);   //check if card already exists/ this should be done in the library
                }
                catch (MongoException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                catch (BankingExistingCardException e) {
                    System.out.println("Card already exists");
                    return;
                }

             //   Main.getCardsPanel().addCard(new Card(cardNumber, cvv, expiration, sold));
                addCardPanel.setVisible(false);
            }
        });

        addCardXButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCardPanel.setVisible(false);
            }
        });
    }

    public void setAddCardPanelVisibility(boolean visibility)
    {
        addCardPanel.setVisible(visibility);
    }

    public JPanel getPanel()
    {
        return addCardPanel;
    }
}

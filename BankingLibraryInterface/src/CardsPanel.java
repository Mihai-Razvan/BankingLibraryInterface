import com.BankingLibrary.Card;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CardsPanel {

    private JScrollPane panel;
    private ArrayList<Card> cardsList;

    public CardsPanel(int frameWidth, int frameHeight)
    {
        cardsList = new ArrayList<>();

        panel = new JScrollPane();
        panel.setBounds(50, frameHeight / 10 + 50, frameWidth - 100, frameHeight / 10 * 9 - 100);
        panel.setBackground(new Color(240, 240, 240, 94));
    }

    public JScrollPane getPanel()
    {
        return panel;
    }

    public void addCard(Card card)
    {
        cardsList.add(card);
        JPanel cardPanel = new JPanel();
        cardPanel.setBackground(Color.red);
        JLabel numberLabel = new JLabel(card.getCardNumber());
        JLabel cvvLabel = new JLabel(card.getCvv());
        JLabel expirationLabel = new JLabel(card.getExpirationDate());

        cardPanel.add(numberLabel);
        cardPanel.add(cvvLabel);
        cardPanel.add(expirationLabel);

        cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.X_AXIS));
        panel.add(numberLabel);
    }
}

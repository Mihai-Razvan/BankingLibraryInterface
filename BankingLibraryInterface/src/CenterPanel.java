import com.BankingLibrary.Bank;
import com.BankingLibrary.BankingExistingCardException;
import com.BankingLibrary.Card;
import com.mongodb.MongoException;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CenterPanel {

    private JPanel panel;

    public CenterPanel(int frameWidth, int frameHeight)
    {
        panel = new JPanel();
        panel.setBounds(0, frameHeight / 10, frameWidth / 5 * 4, frameHeight / 10 * 9);
        panel.setBackground(new Color(255, 255, 255, 100));
        panel.setBorder(BorderFactory.createMatteBorder(0,0,0,2, Color.black));
        panel.setLayout(null);
    }

    public JPanel getPanel() {
        return panel;
    }
}

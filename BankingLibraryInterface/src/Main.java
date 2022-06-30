import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.BankingLibrary.Bank;

import javax.print.attribute.standard.PrinterName;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {

    private static JFrame frame;
    private static TopPanel topPanel;
    private static RightPanel rightPanel;
    private static CenterPanel centerPanel;
    private static AddCardPanel addCardPanel;
    private static CardsPanel cardsPanel;

    public static void main(String[] args) {
        frame = new JFrame("Panel Example");
        frame.setSize(800,800);

        topPanel = new TopPanel(frame.getWidth(), frame.getHeight());
        rightPanel = new RightPanel(frame.getWidth(), frame.getHeight());
        centerPanel = new CenterPanel(frame.getWidth(), frame.getHeight());
        addCardPanel = new AddCardPanel(centerPanel.getPanel().getWidth(), centerPanel.getPanel().getHeight());
        cardsPanel = new CardsPanel(centerPanel.getPanel().getWidth(), frame.getHeight());

        frame.add(topPanel.getPanel());
        frame.add(rightPanel.getPanel());
        frame.add(centerPanel.getPanel());
        frame.add(cardsPanel.getPanel());
        frame.add(addCardPanel.getPanel());

        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });
    }

    public static TopPanel getTopPanel() {
        return topPanel;
    }

    public static RightPanel getRightPanel() {
        return rightPanel;
    }

    public static CenterPanel getCenterPanel() {
        return centerPanel;
    }

    public static AddCardPanel getAddCardPanel() {
        return addCardPanel;
    }

    public static CardsPanel getCardsPanel()
    {
        return cardsPanel;
    }
}

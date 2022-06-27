import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.BankingLibrary.Bank;

import javax.print.attribute.standard.PrinterName;
import javax.swing.border.Border;

public class Main {

    private static Frame frame;
    private static TopPanel topPanel;
    private static RightPanel rightPanel;
    private static CenterPanel centerPanel;

    public static void main(String[] args) {
        frame = new Frame("Panel Example");
        frame.setSize(800,800);

        topPanel = new TopPanel(frame.getWidth(), frame.getHeight());
        rightPanel = new RightPanel(frame.getWidth(), frame.getHeight());
        centerPanel = new CenterPanel(frame.getWidth(), frame.getHeight());

        frame.add(topPanel.getPanel());
        frame.add(rightPanel.getPanel());
        frame.add(centerPanel.getPanel());

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
}

import java.awt.*;
import com.BankingLibrary.Bank;

import javax.print.attribute.standard.PrinterName;
import javax.swing.border.Border;

public class Main {

    public static void main(String[] args) {
        Frame frame = new Frame("Panel Example");
        frame.setSize(800,800);

        TopPanel topPanel = new TopPanel(frame.getWidth(), frame.getHeight());
        RightPanel rightPanel = new RightPanel(frame.getWidth(), frame.getHeight());
        CenterPanel centerPanel = new CenterPanel(frame.getWidth(), frame.getHeight());

        frame.add(topPanel.getPanel());
        frame.add(rightPanel.getPanel());
        frame.add(centerPanel.getPanel());

        frame.setLayout(null);
        frame.setVisible(true);
    }
}

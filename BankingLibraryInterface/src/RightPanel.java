import javax.swing.*;
import java.awt.*;

public class RightPanel {

    private JPanel panel;

    public RightPanel(int frameWidth, int frameHeight)
    {
        panel = new JPanel();
        panel.setBounds(frameWidth / 5 * 4, frameHeight / 10, frameWidth / 5, frameHeight / 10 * 9);
        panel.setBackground(new Color(240, 240, 240, 94));
        panel.setLayout(null);
    }

    public JPanel getPanel() {
        return panel;
    }
}

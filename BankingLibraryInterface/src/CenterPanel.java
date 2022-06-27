import java.awt.*;

public class CenterPanel {

    Panel panel;

    public CenterPanel(int frameWidth, int frameHeight)
    {
        panel = new Panel();
        panel.setBackground(Color.yellow);
        panel.setBounds(0, frameHeight / 10, frameWidth / 5 * 4, frameHeight / 10 * 9);
    }

    public Panel getPanel() {
        return panel;
    }
}

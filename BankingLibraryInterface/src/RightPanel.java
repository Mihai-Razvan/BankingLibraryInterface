import java.awt.*;

public class RightPanel {

    private Panel panel;

    public RightPanel(int frameWidth, int frameHeight)
    {
        panel = new Panel();
        panel.setBackground(Color.magenta);
        panel.setBounds(frameWidth / 5 * 4, frameHeight / 10, frameWidth / 5, frameHeight / 10 * 9);
    }

    public Panel getPanel() {
        return panel;
    }
}

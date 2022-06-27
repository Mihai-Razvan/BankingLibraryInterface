import java.awt.*;

public class TopPanel {

    private Panel panel;

    public TopPanel(int frameWidth, int frameHeight)
    {
        panel = new Panel();
        panel.setBackground(Color.blue);
        panel.setBounds(0, 0, frameWidth, frameHeight / 10);
    }

    public Panel getPanel() {
        return panel;
    }
}

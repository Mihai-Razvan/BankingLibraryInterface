import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopPanel {

    private Panel panel;
    private Button addButton;

    public TopPanel(int frameWidth, int frameHeight)
    {
        panel = new Panel();
        panel.setBackground(Color.blue);
        panel.setBounds(0, 0, frameWidth, frameHeight / 10);
        panel.setLayout(null);

        setAddButton();
    }

    private void setAddButton()
    {
        addButton = new Button("Add card");
        addButton.setBounds(100, 20, 100, 40);
        panel.add(addButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.getCenterPanel().setAddCardPanelVisibility(true);
            }
        });
    }

    public Panel getPanel() {
        return panel;
    }
}

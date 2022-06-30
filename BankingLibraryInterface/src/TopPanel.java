import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopPanel {

    private JPanel panel;
    private JButton addButton;

    public TopPanel(int frameWidth, int frameHeight)
    {
        panel = new JPanel();
        panel.setBackground(new Color(240, 240, 240, 94));
        panel.setBounds(0, 0, frameWidth, frameHeight / 10);
        panel.setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.black));
        panel.setLayout(null);

        setAddButton();
    }

    private void setAddButton()
    {
        addButton = new JButton("Add card");
        addButton.setBounds(100, 20, 100, 40);
        panel.add(addButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.getAddCardPanel().setAddCardPanelVisibility(true);
            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }
}

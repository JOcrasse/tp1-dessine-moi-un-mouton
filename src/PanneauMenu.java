import javax.swing.*;
import java.awt.*;

public class PanneauMenu extends JPanel {

    public PanneauMenu() {
        setBackground(Color.GRAY);
        JLabel label = new JLabel("Menu");
        JButton button = new JButton("Bouton");
        //setMinimumSize(new Dimension(300, 300));
        add(label);
    }
}

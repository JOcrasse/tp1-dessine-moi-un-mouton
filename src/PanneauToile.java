import javax.swing.*;
import java.awt.*;

public class PanneauToile extends JPanel {

    public PanneauToile() {
        setBackground(Color.WHITE);
        JLabel label = new JLabel("Toile");
        add(label);
        //setMinimumSize(new Dimension(600, 300));
    }
}

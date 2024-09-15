import javax.swing.*;
import java.awt.*;

public class PanneauApplication extends JFrame {

    public PanneauApplication() {
        setTitle("Dessine moi un mouton !");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        //pack();
        setVisible(true);
        //setMinimumSize(new Dimension(1000, 300));
        /*JLabel jLabel = new JLabel("JLabel Modele");
        add(jLabel, BorderLayout.CENTER);*/
        //frame.setFocusableWindowState(true);
        //setSize(1000, 750);


    }
}

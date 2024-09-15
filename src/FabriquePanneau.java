import javax.swing.*;
import java.awt.*;

public class FabriquePanneau {

    public FabriquePanneau() {
        PanneauApplication application = new PanneauApplication();
        PanneauMenu menu = new PanneauMenu();
        PanneauToile toile = new PanneauToile();
        application.add(menu,BorderLayout.WEST);
        application.add(toile,BorderLayout.EAST);
        application.setSize(1000,400);
        //menu.getPanel().setSize(600, 300);
    }
}

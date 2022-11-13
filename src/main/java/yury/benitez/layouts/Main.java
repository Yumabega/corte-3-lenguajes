package yury.benitez.layouts;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel {
    public Main() {
        JFrame frame = new JFrame();
        new Panel(frame);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo((Component)null);
        frame.setVisible(true);
    }
}

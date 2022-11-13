package yury.benitez.layouts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu implements ActionListener {
    public final JMenuBar menu;
    private final JMenuItem menuItem11;
    private final JMenuItem menuItem21;
    private final JLabel labelStatus;

    public Menu(JLabel label) {
        this.labelStatus = label;
        this.menu = new JMenuBar();
        JMenu menu1 = new JMenu("Opciones");
        this.menu.add(menu1);
        JMenu menu2 = new JMenu("Otras opciones");
        this.menu.add(menu2);
        this.menuItem11 = new JMenuItem("Opt11");
        menu1.add(this.menuItem11);
        this.menuItem11.addActionListener(this);
        this.menuItem21 = new JMenuItem("Opt21");
        menu2.add(this.menuItem21);
        this.menuItem21.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.menuItem11) {
            this.labelStatus.setText("Selecciono la opcion Opt11");
            System.out.println("hola");
        }

        if (e.getSource() == this.menuItem21) {
            this.labelStatus.setText("Selecciono la opcion Opt21");
            System.out.println("hola2");
        }

    }
}

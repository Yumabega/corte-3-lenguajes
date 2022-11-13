package yury.benitez.layouts;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel {
    private JPanel container = new JPanel();
    private ArrayList<JTextField> products = new ArrayList();
    private JTextField totals;

    private JTextField buildForm(String label, Boolean editable) {
        JPanel panelForm = new JPanel();
        JLabel labelProduct = new JLabel(label);
        JTextField product = new JTextField("", 20);
        product.setEditable(editable);
        panelForm.add(labelProduct);
        panelForm.add(product);
        this.container.add(panelForm);
        return product;
    }

    public Panel(JFrame frame) {
        this.container.setLayout(new BoxLayout(this.container, 1));
        frame.add(this.container);
        JPanel panelTop = new JPanel();
        JLabel labelMenu = new JLabel("Este label es para mostrar el menu seleccionado");
        Menu menuBar = new Menu(labelMenu);
        frame.setJMenuBar(menuBar.menu);
        panelTop.setLayout(new FlowLayout(1, 5, 5));
        panelTop.add(labelMenu);
        this.container.add(panelTop);

        for(int i = 1; i <= 5; ++i) {
            this.products.add(this.buildForm("Producto " + i, true));
        }

        this.totals = this.buildForm("Totales     ", false);
        JPanel panelBottom = new JPanel();
        new Btn("sum", panelBottom, this.totals, this.products);
        new Btn("multi", panelBottom, this.totals, this.products);
        new Btn("avg", panelBottom, this.totals, this.products);
        this.container.add(panelBottom);
    }
}

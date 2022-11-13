package yury.benitez.layouts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import yury.benitez.logic.Avg;
import yury.benitez.logic.Multi;
import yury.benitez.logic.Sum;

public class Btn implements ActionListener {
    private JButton btn;
    private String action;
    private ArrayList<JTextField> results = new ArrayList();
    private ArrayList<String> numbers = new ArrayList();
    private JTextField result;

    public Btn(String act, JPanel panel, JTextField resultField, ArrayList<JTextField> resultsList) {
        this.result = resultField;
        this.results = resultsList;
        this.action = act;
        String text = "";
        byte var7 = -1;
        switch(act.hashCode()) {
            case 96978:
                if (act.equals("avg")) {
                    var7 = 2;
                }
                break;
            case 114251:
                if (act.equals("sum")) {
                    var7 = 0;
                }
                break;
            case 104256825:
                if (act.equals("multi")) {
                    var7 = 1;
                }
        }

        switch(var7) {
            case 0:
                text = "Sumar";
                break;
            case 1:
                text = "Multiplicar";
                break;
            case 2:
                text = "Promedio";
        }

        this.btn = new JButton(text);
        this.btn.addActionListener(this);
        panel.add(this.btn);
    }

    public void actionPerformed(ActionEvent e) {
        double total = 0.0D;
        if (e.getSource() == this.btn) {
            Iterator var4 = this.results.iterator();

            while(var4.hasNext()) {
                JTextField product = (JTextField)var4.next();
                this.numbers.add(product.getText());
            }

            String var9 = this.action;
            byte var10 = -1;
            switch(var9.hashCode()) {
                case 96978:
                    if (var9.equals("avg")) {
                        var10 = 2;
                    }
                    break;
                case 114251:
                    if (var9.equals("sum")) {
                        var10 = 0;
                    }
                    break;
                case 104256825:
                    if (var9.equals("multi")) {
                        var10 = 1;
                    }
            }

            switch(var10) {
                case 0:
                    Sum sum = new Sum(this.numbers);
                    total = sum.result;
                    break;
                case 1:
                    Multi multi = new Multi(this.numbers);
                    total = multi.result;
                    break;
                case 2:
                    Avg avg = new Avg(this.numbers);
                    total = avg.result;
            }
        }

        this.result.setText(String.valueOf(total));
    }
}

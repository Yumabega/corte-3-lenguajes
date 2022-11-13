package yury.benitez.logic;

import java.util.ArrayList;
import java.util.Iterator;

public class Multi {
    public double result = 0.0D;

    public Multi(ArrayList<String> numbersList) {
        double total = 1.0D;

        String number;
        for(Iterator var4 = numbersList.iterator(); var4.hasNext(); total *= Double.parseDouble(number)) {
            number = (String)var4.next();
        }

        this.result = total;
    }
}

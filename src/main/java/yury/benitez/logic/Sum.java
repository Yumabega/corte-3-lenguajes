package yury.benitez.logic;

import java.util.ArrayList;
import java.util.Iterator;

public class Sum {
    public double result = 0.0D;

    public Sum(ArrayList<String> numbersList) {
        double total = 0.0D;

        String number;
        for(Iterator var4 = numbersList.iterator(); var4.hasNext(); total += Double.parseDouble(number)) {
            number = (String)var4.next();
        }

        this.result = total;
    }
}

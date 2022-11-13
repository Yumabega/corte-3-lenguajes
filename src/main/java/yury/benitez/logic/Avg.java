package yury.benitez.logic;

import java.util.ArrayList;

public class Avg {
    public double result = 0.0D;

    public Avg(ArrayList<String> numbersList) {
        Sum sum = new Sum(numbersList);
        this.result = sum.result / (double)numbersList.size();
    }
}

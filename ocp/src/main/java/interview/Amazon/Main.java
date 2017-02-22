package interview.Amazon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Material> list = new ArrayList<>();
        list.add(new Coffie("coffie", 1.5, 5));;
        list.add(new Milk("milk", 1.0, 6));

        double amount = 0;
        for (Material material : list) {
            amount += material.getAmount() * material.getPrice();
        }

        System.out.println(amount);
    }
}

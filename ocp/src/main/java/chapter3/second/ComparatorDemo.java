package chapter3.second;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo{
    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quark", 7));
        ducks.add(new Duck("Puddles", 10));

        Collections.sort(ducks);
        System.out.println(ducks);

        Comparator<Duck> comparator = (d1, d2) -> d1.getWeight() - d2.getWeight();

        Collections.sort(ducks, comparator);
        System.out.println(ducks);
    }
}

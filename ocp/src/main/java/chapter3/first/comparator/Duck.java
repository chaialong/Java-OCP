package chapter3.first.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Duck implements Comparable<Duck> {
    private String name;
    private int weight;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name;
    }

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Duck o) {
        return name.compareTo(o.name);
    }

    public static void main(String[] args) {
        Comparator<Duck> byWeight = (d1, d2) -> d1.weight - d2.weight;
        List<Duck> duckList = new ArrayList<>();
        duckList.add(new Duck("Quark", 7));
        duckList.add(new Duck("Puddles", 10));
        Collections.sort(duckList);
        System.out.println(duckList);
        Collections.sort(duckList, byWeight);
        System.out.println(duckList);
    }
}

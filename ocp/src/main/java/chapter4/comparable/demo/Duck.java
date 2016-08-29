package chapter4.comparable.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Duck implements Comparable<Duck> {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Duck o) {
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        List<Duck> list = new ArrayList<>();
        list.add(new Duck("Quark"));
        list.add(new Duck("Puddles"));

        System.out.println("Before sort: " + list);
        Collections.sort(list);
        System.out.println("After sort: " + list);
    }
}

package chapter3.second.questions;

import java.util.Comparator;
import java.util.TreeSet;

public class Q14 implements Comparable<Q14>, Comparator<Q14> {
    private int num;
    private String name;

    public Q14(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString() {
        return "" + num;
    }

    @Override
    public int compareTo(Q14 o) {
        return name.compareTo(o.name);
    }

    @Override
    public int compare(Q14 o1, Q14 o2) {
        return o1.num - o2.num;
    }

    public static void main(String[] args) {
        Q14 s1 = new Q14(88, "a");
        Q14 s2 = new Q14(55, "b");
        TreeSet<Q14> t1 = new TreeSet<>();
        t1.add(s1);
        t1.add(s2);
        TreeSet<Q14> t2 = new TreeSet<>(s1);
        t2.add(s1);
        t2.add(s2);
        System.out.println(t1);
        System.out.println(t2);
    }
}

package chapter3.first.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 10; i >= 0; i--) {
            set.add(i);
        }

        System.out.println(set);

        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 10; i >= 0; i--) {
            treeSet.add(i);
        }
        System.out.println(treeSet);
    }
}

package chapter3.second.questions;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(16);
        boolean b2 = set.add(18);
        boolean b3 = set.add(16);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}

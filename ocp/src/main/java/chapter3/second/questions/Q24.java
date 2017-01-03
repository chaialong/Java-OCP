package chapter3.second.questions;

import java.util.HashSet;
import java.util.Set;

public class Q24 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("lion");
        s.add("tiger");
        s.add("bear");
//        s.forEach(x -> System.out.println(x));
        s.forEach(System.out::println);
    }
}

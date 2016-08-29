package chapter4.builtin.functional.interfaces;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> p1 = x -> x.isEmpty();
        Predicate<String> p2 = String::isEmpty;
        System.out.println(p1.test(""));
        System.out.println(p2.test(""));
    }
}

package chapter4.first.interfaces;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<String, String> b1 = (x, y) -> x.startsWith(y);
        BiPredicate<String, String> b2 = String::startsWith;
        System.out.println(b1.test("hello world", "hello"));
        System.out.println(b2.test("hello world", "world"));
    }
}

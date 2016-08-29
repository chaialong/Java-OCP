package chapter4.builtin.functional.interfaces;

import java.util.function.Predicate;

public class PredicateMultiDemo {
    public static void main(String[] args) {
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        Predicate<String> brownEggs = egg.and(brown);
        Predicate<String> otherEggs = egg.and(brown.negate());

        System.out.println(brownEggs.test("this is brown eggs"));
        System.out.println(otherEggs.test("this is other eggs"));
    }
}

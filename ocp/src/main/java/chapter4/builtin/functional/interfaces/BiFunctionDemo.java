package chapter4.builtin.functional.interfaces;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<String, String, String> b1 = (x, y) -> x.concat(y);
        BiFunction<String, String, String> b2 = String::concat;
        System.out.println(b1.apply("ALong", "Chai"));
        System.out.println(b2.apply("ALong", "Chai"));
    }
}

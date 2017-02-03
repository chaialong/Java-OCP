package chapter4.first.interfaces;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> f1 = (x) -> x.length();
        Function<String, Integer> f2 = String::length;

        System.out.println(f1.apply("hello world"));
        System.out.println(f2.apply("hello world"));
    }
}

package chapter4.builtin.functional.interfaces;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MoreExercise {
    public static void main(String[] args) {
        Predicate<List> ex1 = x -> "".equals(x.get(0));
        Consumer<Long> ex2 = x -> System.out.println(x);
        BiPredicate<String, String> ex3 = (x, y) -> true;
    }
}

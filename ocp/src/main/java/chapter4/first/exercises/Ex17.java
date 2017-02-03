package chapter4.first.exercises;

import java.util.function.BooleanSupplier;
import java.util.function.Function;

public class Ex17 {
    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x * x;
        BooleanSupplier b = () -> true;
        boolean asBoolean = b.getAsBoolean();
        System.out.println(asBoolean);
    }
}

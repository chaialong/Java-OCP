package chapter4.primitive;

import java.util.function.DoubleToIntFunction;
import java.util.stream.DoubleStream;

public class DoubleStreamDemo {
    public static void main(String[] args) {
        DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
        System.out.println(doubles.limit(1000).max());

        double d = 1.0;
        DoubleToIntFunction f1 = x -> 1;
        System.out.println(f1.applyAsInt(d));
    }
}

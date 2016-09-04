package chapter4.primitive;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveDemo1 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.iterate(1, x -> x + 1);
        System.out.println(intStream.limit(100).sum());

        DoubleStream random = DoubleStream.generate(Math::random);
        DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
        random.limit(3).forEach(System.out::println);
        System.out.println();
        fractions.limit(100).forEach(System.out::println);
    }
}

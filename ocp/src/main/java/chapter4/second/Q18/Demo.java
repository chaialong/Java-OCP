package chapter4.second.Q18;

import chapter4.first.primitive.DoubleStreamDemo;

import java.util.function.IntSupplier;
import java.util.stream.DoubleStream;

public class Demo {
    public static void main(String[] args) {
        DoubleStream s = DoubleStream.of(1.2, 2.4);
        long num = s.peek(System.out::println).filter(x -> x > 2).count();
        System.out.println(num);

    }
}

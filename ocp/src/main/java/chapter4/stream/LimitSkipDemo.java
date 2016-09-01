package chapter4.stream;

import java.util.stream.Stream;

public class LimitSkipDemo {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.iterate(1, x -> x + 1);
        s.skip(5).limit(3).forEach(System.out::println);
    }
}

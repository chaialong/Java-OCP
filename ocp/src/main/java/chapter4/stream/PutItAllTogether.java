package chapter4.stream;

import java.util.stream.Stream;

public class PutItAllTogether {
    public static void main(String[] args) {
        Stream.iterate(1, x -> x + 3)
                .filter(x -> x % 5 == 0)
                .limit(2)
                .sorted()
                .forEach(System.out::println);
        Stream.iterate(1, x -> x + 1)
                .limit(100)
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);
        Stream.iterate(1, x -> x + 1).limit(5)
                .peek(System.out::print)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::print);
    }
}

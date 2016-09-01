package chapter4.stream;

import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1, 2, 3);

        Stream<Double> randoms = Stream.generate(Math::random);
//        randoms.forEach(System.out::println);
        Stream<Integer> oddNumbers = Stream.iterate(1, x -> x + 1);


        oddNumbers.forEach(System.out::println);
    }
}

package chapter4.first.stream;

import java.util.stream.Stream;

public class DistinctDemo {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("cat", "duck", "cat", "duck");
        s.distinct().forEach(System.out::println);
    }
}

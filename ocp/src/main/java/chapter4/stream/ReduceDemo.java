package chapter4.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReduceDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        System.out.println(stream.reduce("", (x, y) -> x + y));
//        System.out.println(stream.reduce("", String::concat));

        Stream<Integer> stream1 = Stream.of(3, 5, 6);
        System.out.println(stream1.reduce(1, (x, y) -> x * y));
    }
}

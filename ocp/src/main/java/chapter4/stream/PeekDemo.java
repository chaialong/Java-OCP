package chapter4.stream;

import java.util.stream.Stream;

public class PeekDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(x -> x.startsWith("g")).peek(System.out::println).count();
        System.out.println(count);
    }
}

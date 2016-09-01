package chapter4.stream;

import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.map(String::length).forEach(System.out::println);
    }
}

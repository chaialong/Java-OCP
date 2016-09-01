package chapter4.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("cat");
        List<String> two = Arrays.asList("pig", "gorilla");

        Stream<List<String>> s = Stream.of(zero, one, two);
        s.flatMap(x -> x.stream()).forEach(System.out::println);
    }
}

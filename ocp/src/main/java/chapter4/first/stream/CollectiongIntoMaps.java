package chapter4.first.stream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectiongIntoMaps {
    public static void main(String[] args) {
        buildMap1();
        buildMap2();
    }

    private static void buildMap1() {
        Stream<String> stream = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = stream.collect(
                Collectors.toMap(x -> x, x -> x.length()));
        System.out.println(map); // {lions=5, bears=5, tigers=6}
    }

    private static void buildMap2() {
        Stream<String> stream = Stream.of("lions", "tigers", "bears", "apple");
        Map<Integer, String> map = stream.collect(Collectors.toMap(
                String::length, x -> x, (x, y) -> x + ", " + y
        ));

        System.out.println(map);
    }
}

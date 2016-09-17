package chapter4.advanced.stream;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.minBy;

public class ComplexDemo {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Integer, Optional<Character>> map = ohMy.collect(
//                groupingBy(
//                        String::length,
//                        mapping(s -> s.charAt(0),
//                                minBy(Comparator.naturalOrder()))));
//        System.out.println(map);
    }
}

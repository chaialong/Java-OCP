package chapter4.first.stream;

import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

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

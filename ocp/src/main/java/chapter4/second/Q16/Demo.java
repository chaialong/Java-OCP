package chapter4.second.Q16;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("hello");
        Stream<String> s2 = Stream.of("hello");

        Map<Boolean, List<String>> p = s1.collect(Collectors.partitioningBy(x -> x.startsWith("c")));
        System.out.println(p);
        Map<Integer, List<String>> g = s2.collect(Collectors.groupingBy(String::length));
        System.out.println(g);
    }
}

package chapter4.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortDemo {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("B", "D", "C", "A");
        Stream<String> s2 = Stream.of("B", "D", "C", "A");
        s1.sorted().forEach(System.out::print);
        System.out.println(System.lineSeparator());
        s2.sorted(Comparator.reverseOrder()).forEach(System.out::print);
    }
}

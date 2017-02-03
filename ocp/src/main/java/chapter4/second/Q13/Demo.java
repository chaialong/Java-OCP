package chapter4.second.Q13;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        List<Integer> l3 = Collections.emptyList();
        Stream.of(l1, l2, l3).flatMap(Collection::stream)
                .map(x -> x + 1)
                .forEach(System.out::print);
    }
}

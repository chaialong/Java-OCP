package chapter7.ex17;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectResult {
    public static void main(String[] args) {
        GroupingBy();
    }

    private static void CollectExample1() {
        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
        SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
        System.out.println(set);
    }

    private static void CollectExample2(){
        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set);
    }

    private static void CollectExample3(){
        Stream<String> stream = Stream.of("lions", "tigers", "bears").parallel();
        ConcurrentMap<Integer, String> map = stream.collect(
                Collectors.toConcurrentMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
        System.out.println(map);
    }

    private static void GroupingBy(){
        Stream<String> stream = Stream.of("lions", "tigers", "bears").parallel();
        ConcurrentMap<Integer, List<String>> map = stream.collect(Collectors.groupingByConcurrent(String::length));

        System.out.println(map);
    }
}

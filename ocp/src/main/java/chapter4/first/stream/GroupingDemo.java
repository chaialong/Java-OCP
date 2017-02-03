package chapter4.first.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingDemo {
    public static void main(String[] args) {
        ListDemo();
        MapDemo();
        TreeMapSetDemo();
    }

    private static void ListDemo(){
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
        System.out.println(map);
    }

    private static void MapDemo(){
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map = ohMy.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map);
    }

    private static void TreeMapSetDemo(){
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> map = ohMy.collect(Collectors.groupingBy(String::length, TreeMap::new,
                Collectors.toSet()));
        System.out.println(map);
    }
}

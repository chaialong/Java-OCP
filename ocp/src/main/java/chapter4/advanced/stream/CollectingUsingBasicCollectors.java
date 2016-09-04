package chapter4.advanced.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingUsingBasicCollectors {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("lions", "tigers", "bears");
        String result = s.collect(Collectors.joining(", "));
        System.out.println(result);

        Stream<String> s2 = Stream.of("lions", "tigers", "bears");
        System.out.println(s2.collect(Collectors.averagingDouble(String::length)));

        Stream<String> s3 = Stream.of("lions", "tigers", "bears");
        TreeSet<String> treeSet = s3.filter(x -> x.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));
//        List<String> list = s3.collect(Collectors.toCollection(ArrayList::new));
        System.out.println(treeSet);
//        System.out.println(list);
    }
}

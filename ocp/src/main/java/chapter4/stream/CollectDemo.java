package chapter4.stream;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word.toString());

        Stream<String> s2 = Stream.of("w", "o", "l", "f");
//        TreeSet<String> set = s2.collect(TreeSet<String>::new, TreeSet::add, TreeSet::addAll);
        TreeSet<String> set = s2.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);

        Stream<String> s3 = Stream.of("w", "o", "l", "f");
        Set<String> set1 = s3.collect(Collectors.toSet());
        System.out.println(set1);
    }
}

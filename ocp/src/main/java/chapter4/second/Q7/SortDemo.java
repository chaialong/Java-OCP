package chapter4.second.Q7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("dog", "apple", "fish");
        System.out.println(list);
        System.out.println(sort(list));
        System.out.println(list.stream().sorted((x, y) -> y.compareTo(x)).collect(Collectors.toList()));
    }

    private static List<String> sort(List<String> list) {
        List<String> copy = new ArrayList<>(list);
        Collections.sort(copy, (x, y) -> y.compareTo(x));
        return copy;
    }
}

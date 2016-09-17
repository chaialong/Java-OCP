package chapter4.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println(sort(Arrays.asList("body", "dog", "apple")));
    }

    private  static List<String> sort(List<String> list) {
        return list.stream()
                .sorted((x, y) -> x.compareTo(y))
                .collect(Collectors.toList());
    }
}

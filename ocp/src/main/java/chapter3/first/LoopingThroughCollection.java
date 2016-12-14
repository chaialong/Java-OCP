package chapter3.first;

import java.util.Arrays;
import java.util.List;

public class LoopingThroughCollection {
    public static void main(String[] args) {
        List<String> cats = Arrays.asList("Annie", "Ripley");
//        cats.forEach(x -> System.out.println(x));
        cats.forEach(System.out::println);
    }
}

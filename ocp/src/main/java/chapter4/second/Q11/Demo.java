package chapter4.second.Q11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        String collect = Stream.iterate(1, x -> ++x).limit(5).map(x -> x + "").collect(Collectors.joining());
        System.out.println(collect);
    }
}

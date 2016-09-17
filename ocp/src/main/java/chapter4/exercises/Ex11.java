package chapter4.exercises;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex11 {
    public static void main(String[] args) {
        String s = Stream.iterate(1, x -> x++).limit(5).map(x -> "" + x).collect(Collectors.joining());
        System.out.println(s);
        System.out.println(Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining()));
    }
}

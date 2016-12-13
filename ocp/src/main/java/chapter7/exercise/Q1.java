package chapter7.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Q1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.parallelStream();

        Stream s = Arrays.asList(1,2,3).stream();
        s.parallel();

    }
}

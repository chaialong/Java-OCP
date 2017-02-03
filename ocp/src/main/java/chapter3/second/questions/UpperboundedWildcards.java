package chapter3.second.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class UpperboundedWildcards {
    public static long total(List<? extends Number> list) {
        long total = 0;
        for (Number number : list) {
            total += number.longValue();
        }

        return total;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(total(list));
    }
}

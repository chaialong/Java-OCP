package chapter7.ex16;

import java.util.Arrays;

public class ParallelReduction {
    public static void main(String[] args) {
        System.out.println(Arrays.asList('a', 'l', 'o', 'n', 'g')
                .stream()
                .reduce("", (x, y) -> x + y,
                        (u, v) -> u + v));

        System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .reduce(0, (a, b) -> (a - b)));

        System.out.println(Arrays.asList("w", "o", "l", "f")
                .parallelStream()
                .reduce("X", String::concat));
    }
}

package chapter4.chaining.optionals;

import java.util.Optional;

public class ChainingDemo {
    private static void threeDigit(Optional<Integer> optional) {
        optional.map(x -> "" + x)
                .filter(y -> y.length() == 3)
                .ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        threeDigit(Optional.of(123));
        threeDigit(Optional.of(1234));
    }
}

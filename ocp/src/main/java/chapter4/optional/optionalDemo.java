package chapter4.optional;

import java.util.Optional;

public class optionalDemo {
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }

        int num = 0;
        for (int score : scores) {
            num += score;
        }
        return Optional.of((double) num / scores.length);
    }

    public static void main(String[] args) {
        Optional<Double> op = average(90, 100);
        if (op.isPresent()) {
            System.out.println(op.get());
        }

        Optional<Double> opt = average(90, 100);
        opt.ifPresent(System.out::println);
    }
}

package chapter4.second.Q9;

import java.util.OptionalLong;
import java.util.stream.LongStream;

public class Demo {
    public static void main(String[] args) {
        LongStream ls = LongStream.of(1, 2, 3);
        OptionalLong opt = ls.map(x -> x * 10).filter(x -> x < 15).findFirst();

        if (opt.isPresent()) {
            System.out.println(opt.getAsLong());
        }

        opt.ifPresent(System.out::println);
    }
}

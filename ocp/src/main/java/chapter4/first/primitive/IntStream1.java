package chapter4.first.primitive;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntStream1 {
    public static void main(String[] args) {
        IntStream count = IntStream.iterate(1, x -> x + 1).limit(5);
        count.forEach(x -> System.out.printf("%d ", x));
        System.out.println();

        IntStream count2 = IntStream.range(1, 6);
        count2.forEach(x -> System.out.printf("%d ", x));
        System.out.println();

        IntStream count3 = IntStream.rangeClosed(1, 5);
        count3.forEach(x -> System.out.printf("%d ", x));
        System.out.println();

        IntStream count4 = IntStream.rangeClosed(1, 100);
        IntSummaryStatistics statistics = count4.summaryStatistics();
        System.out.println(statistics.getSum());
        System.out.println(statistics.getAverage());
    }
}

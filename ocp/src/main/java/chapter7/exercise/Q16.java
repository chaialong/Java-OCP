package chapter7.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.DoubleStream;

public class Q16 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newScheduledThreadPool(10);
        DoubleStream.of(3.14159, 2.71828)
                .forEach(c -> service.submit(
                        () -> System.out.println(10 * c)
                ));
        service.execute(() -> System.out.println("Printed"));
    }
}

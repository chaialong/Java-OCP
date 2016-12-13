package chapter7.exercise;

import java.util.concurrent.*;

public class Q3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(() -> {
            System.out.println("Open Zoo");
        }, 0, 1, TimeUnit.SECONDS);

        Future<?> result = service.submit(() -> System.out.println("Wake staff"));
        System.out.println(result.get());
    }
}

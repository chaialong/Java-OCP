package interview.concurrency.executer_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("Start");
            service.submit(() -> System.out.println("Printing zoo information"));
            service.submit(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Printing record: " + i);
                }
            });

            service.submit(() -> System.out.println("Printing zoo information"));
            System.out.println("End");
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}

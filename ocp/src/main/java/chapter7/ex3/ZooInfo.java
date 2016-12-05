package chapter7.ex3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZooInfo {
    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();

            System.out.println("begin");
            service.execute(() -> System.out.println("Print zoo inventory"));
            service.execute(() -> {
                for (int i = 0; i < 9; i++) {
                    System.out.println("Print record: " + i);
                }
            });

            service.execute(() -> System.out.println("Print zoo inventory"));

            System.out.println("end");
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}

package interview.concurrency.executer_service;

import java.util.concurrent.*;

public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();

            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 500; i++) {
                    CheckResults.counter++;
                }
                return CheckResults.counter;
            });

            result.get(10, TimeUnit.SECONDS);

            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}

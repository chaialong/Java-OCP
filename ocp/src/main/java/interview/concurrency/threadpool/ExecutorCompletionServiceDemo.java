package interview.concurrency.threadpool;

import java.util.concurrent.*;

public class ExecutorCompletionServiceDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService threadPool = null;

        try {
            threadPool = Executors.newFixedThreadPool(10);
            CompletionService pool = new ExecutorCompletionService<String>(threadPool);
            for (int i = 0; i < 10; i++) {
                pool.submit(new CallableTask());
            }

            for (int i = 0; i < 10; i++) {
                System.out.println(pool.take().get());
            }
        } finally {
            if (threadPool != null) {
                threadPool.shutdown();
            }
        }
    }

}

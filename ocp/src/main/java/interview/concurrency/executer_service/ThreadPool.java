package interview.concurrency.executer_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    private int sheepCount = 0;
    private void addAndPrint(){
        System.out.print(++sheepCount + " ");
    }

    public static void main(String[] args) {
        ExecutorService service = null;

        try{
            service = Executors.newFixedThreadPool(20);
            ThreadPool manager = new ThreadPool();
            for (int i = 0; i < 10; i++) {
                service.submit(() -> manager.addAndPrint());
            }
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}

package interview.concurrency.test1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CurrencyDemo implements Runnable {
    volatile int count = 0;
    AtomicInteger atomicInteger = new AtomicInteger(0);
    static Lock lock = new ReentrantLock();



    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            count++;
            atomicInteger.getAndIncrement();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CurrencyDemo c1 = new CurrencyDemo();

        (new Thread(c1)).start();
        (new Thread(c1)).start();

        Thread.sleep(100);
        System.out.println(c1.count);
        System.out.println(c1.atomicInteger.get());
    }
}

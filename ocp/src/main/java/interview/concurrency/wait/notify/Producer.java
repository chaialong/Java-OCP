package interview.concurrency.wait.notify;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable {
    private Queue<Integer> queue;
    private int maxSize;

    public Producer(Queue<Integer> queue, int maxSize) {
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.size() == maxSize) {
                    try {
                        System.out.println("Queue is full, Producer thread waiting for consumer to take something from queue");
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Random random = new Random();
                int i = random.nextInt();
                System.out.println("thread: "+ Thread.currentThread().getName() + ". Producing value: " + i+ ". Queue size: " + queue.size());
                queue.add(i);
                queue.notifyAll();
            }
        }
    }
}

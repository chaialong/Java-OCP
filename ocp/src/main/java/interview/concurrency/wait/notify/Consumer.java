package interview.concurrency.wait.notify;

import java.util.Queue;

public class Consumer implements Runnable {
    private Queue<Integer> queue;
    private int maxSize;

    public Consumer(Queue<Integer> queue, int maxSize) {
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    System.out.println("Queue is empty, Consumer thread is waiting for producer thread to put something in queue");
                    try {
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
                System.out.println("thread: "+ Thread.currentThread().getName() + ". Consuming value: " + queue.remove() + ". Queue size: " + queue.size());
                queue.notifyAll();
            }
        }
    }
}

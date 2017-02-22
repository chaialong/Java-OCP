package interview.concurrency.wait.notify;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int maxSize = 20;
        Consumer consumer = new Consumer(queue, maxSize);
        Producer producer = new Producer(queue, maxSize);

        (new Thread(producer, "producer")).start();
        (new Thread(consumer, "consumer")).start();
    }
}

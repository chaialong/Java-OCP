package chapter7.ex10;

import java.util.Deque;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentCollection {
    public static void main(String[] args) {
        ConcurrentCollection collection = new ConcurrentCollection();
        collection.concurrentHashMapTest();
        collection.concurrentLinkedQueueTest();
        collection.concurrentLinkedDequeTest();
    }

    private void concurrentHashMapTest(){
        Map<String, Integer> map = new ConcurrentHashMap<>();

        map.put("zabra", 52);
        map.put("elephant", 10);
        System.out.println(map.get("elephant"));
    }

    private void concurrentLinkedQueueTest(){
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.offer(11);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }

    private void concurrentLinkedDequeTest(){
        Deque<Integer> deque = new ConcurrentLinkedDeque<>();
        deque.offer(12);
        deque.push(13);
        System.out.println(deque.peek());
        System.out.println(deque.pop());
    }
}

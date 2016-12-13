package chapter7.exercise;

import java.util.Arrays;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class Q14 {
    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<Integer> deque = new LinkedBlockingDeque<>(Arrays.asList(1, 2, 103, 200, 1));
        addAndPrintItems(deque);
    }

    public static void addAndPrintItems(BlockingDeque<Integer> deque) throws InterruptedException {
        deque.offer(103);
        deque.offerFirst(20, 1, TimeUnit.SECONDS );
        deque.offerLast(85, 2, TimeUnit.SECONDS);
        System.out.println(deque.pollFirst(200, TimeUnit.NANOSECONDS));
        System.out.println(deque.pollLast(1, TimeUnit.SECONDS));
    }
}

package chapter3.second;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        queue();
        stack();
    }

    private static void queue() {
        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println(queue.offer(10));
        System.out.println(queue.offer(5));
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }

    private static void stack(){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(12);
        stack.push(5);
        System.out.println(stack.peek());
        System.out.println(stack.poll());
        System.out.println(stack.poll());
        System.out.println(stack.peek());
    }
}

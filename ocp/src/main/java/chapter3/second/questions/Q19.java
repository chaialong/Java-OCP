package chapter3.second.questions;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q19 {
    private static void listDemo(){
        List<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1);
        System.out.println(q);
    }

    private static void queueDemo(){
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1);
        System.out.println(q);
    }

    public static void main(String[] args) {
        listDemo();
        queueDemo();
    }
}

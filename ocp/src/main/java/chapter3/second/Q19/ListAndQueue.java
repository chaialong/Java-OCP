package chapter3.second.Q19;

import java.util.*;

public class ListAndQueue {
    public static void main(String[] args) {
        listDemo();
        queueDemo();
    }

    private static void listDemo(){
        List<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(12);
        l.remove(1);
        System.out.println(l);
    }

    private static void queueDemo(){
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1);
        System.out.println(q);
    }
}

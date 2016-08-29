package chapter3.review.questions;

import java.util.LinkedList;
import java.util.Queue;

public class Ex19 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1);
        System.out.println(q);
    }
}

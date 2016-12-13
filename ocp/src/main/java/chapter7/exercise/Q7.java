package chapter7.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q7 {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = new CopyOnWriteArrayList<>(l1);
        Set<Integer> s3 = new ConcurrentSkipListSet<>();
        s3.addAll(l1);

        for (Integer item : l2) {
            l2.add(4);
        }

        for (Integer item : s3) {
            s3.add(4);
        }

        System.out.println(l1.size() + " " + l2.size() + " " + s3.size());
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(s3);
    }
}

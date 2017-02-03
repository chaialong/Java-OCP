package chapter3.second.Q8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int nextInt = random.nextInt(100);
            list.add(nextInt);
            treeSet.add(nextInt);
        }

        for (Integer integer : treeSet) {
            System.out.print(integer + " ");
        }
        System.out.println();
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}

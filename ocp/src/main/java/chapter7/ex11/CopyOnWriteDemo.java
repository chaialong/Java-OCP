package chapter7.ex11;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteDemo {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 25));
        for (Integer i : list) {
            System.out.println(i);
            list.add(9);
        }

        System.out.println();
        System.out.println("Size: " + list.size());
    }
}

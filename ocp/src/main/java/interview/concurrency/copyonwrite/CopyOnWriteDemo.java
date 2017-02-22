package interview.concurrency.copyonwrite;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteDemo {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 25));
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println(list.size());
        System.out.println(list);
    }
}

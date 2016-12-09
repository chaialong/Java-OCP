package chapter7.ex12;

import java.util.*;

public class SynchronizedCollection {
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(
                new ArrayList<>(Arrays.asList(4,3,52)));
        synchronized(list) {
            for(int data: list)
                System.out.print(data+" ");
        }

    }
}

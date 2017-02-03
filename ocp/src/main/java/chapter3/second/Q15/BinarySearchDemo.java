package chapter3.second.Q15;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchDemo {
    public static void main(String[] args) {
        Comparator<Integer> c = (x, y) -> y -x;
        List<Integer> list = Arrays.asList(5, 4, 7, 1);
        System.out.println(list);
        Collections.sort(list, c);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, 1, c));
    }
}

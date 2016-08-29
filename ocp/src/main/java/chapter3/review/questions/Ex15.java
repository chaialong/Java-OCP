package chapter3.review.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex15 {
    public static void main(String[] args) {
        Comparator<Integer> c = (x, y) -> y -x;
        List<Integer> list = Arrays.asList(5, 4, 7, 1);
        Collections.sort(list, c);
        System.out.println(Collections.binarySearch(list, 1));

    }
}

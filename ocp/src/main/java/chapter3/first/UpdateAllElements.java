package chapter3.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdateAllElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.replaceAll(x -> x * 2);
        System.out.println(list);
    }
}

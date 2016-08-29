package chapter4.review.questions;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add(7);
        for (Object s : list) {
            System.out.println(s);
        }
    }
}

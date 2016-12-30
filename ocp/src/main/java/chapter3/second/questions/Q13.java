package chapter3.second.questions;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Vector;

public class Q13 {
    public void showSize(List<?> list) {
        System.out.println(list.size());
    }
    public static void main(String[] args) {
        Q13 card = new Q13();
//        ArrayDeque<?> list = new ArrayDeque<String>();
        Vector<? extends Number> list = new Vector<Integer>();
        card.showSize(list);
    }
}

package chapter3.second.questions;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("SD");
        list.add(0, "NY");
        list.set(1, "FL");
        list.remove("NY");
        list.remove(0);
        System.out.println(list);
    }
}

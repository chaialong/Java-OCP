package chapter3.second;

import java.util.ArrayList;
import java.util.List;

public class UnboundedList {
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("hello");
        printList(keywords);
    }
}

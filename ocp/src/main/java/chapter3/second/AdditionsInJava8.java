package chapter3.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdditionsInJava8 {
    public static void main(String[] args) {
        removeIfDemo();
        replaceAllDemo();
    }

    private static void removeIfDemo(){
        List<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");

        System.out.println(list);
        list.removeIf(x -> x.startsWith("A"));
        System.out.println(list);
    }

    private static void replaceAllDemo(){
        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println(list);

        list.replaceAll(x -> x * 2);
        System.out.println(list);
    }
}

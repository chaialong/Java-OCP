package chapter3.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        String[] array = {"gerbil", "mouse"};
        List<String> list = Arrays.asList(array);
        list.set(1, "test");
        array[0] = "new";
        String[] array2 = (String[]) list.toArray();
//        list.remove(1);

        List<String> temp = new ArrayList<>();
        for (String s : temp) {
            System.out.println(s);
        }
    }
}

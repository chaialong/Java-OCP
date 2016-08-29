package chapter4.builtin.functional.interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", 8);
        b2.accept("chick", 1);

        System.out.println(map);
    }
}

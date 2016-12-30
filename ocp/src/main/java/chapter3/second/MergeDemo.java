package chapter3.second;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MergeDemo {
    public static void main(String[] args) {
        mergeDemo2();
    }

    private static void mergeDemo2(){
        BiFunction<String, String, String> mapper = (x, y) -> null;
        Map<String, String> map = new HashMap<>();
        map.put("Jenny", "Bus tour");
        map.put("Tom", "Bus tour");

        map.merge("Jenny", "Skyride", mapper);
        map.merge("Sam", "Skyride", mapper);

        System.out.println(map);
    }

    private static void mergeDemo1() {
        BiFunction<String, String, String> mapper = (x, y) -> x.length() > y.length() ? x : y;
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus tour");
        favorites.put("Tom", "Tram");

        String jenny = favorites.merge("Jenny", "Skyride", mapper);
        String tom = favorites.merge("Tom", "Skyride", mapper);
        System.out.println(jenny);
        System.out.println(tom);
        System.out.println(favorites);
    }
}

package chapter4.map_apis;

import java.util.HashMap;
import java.util.Map;

public class putIfAbsentDemo {
    public static void main(String[] args) {
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);

        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tom");
        favorites.putIfAbsent("Tom", "Tram");

        System.out.println(favorites);
    }
}

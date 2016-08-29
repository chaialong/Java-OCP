package chapter3.map_apis;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class mergeDemoTest {
    @Test
    public void testMerge(){
        BiFunction<String, String, String> mapper = (v1, v2) -> null;

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Bus Tour");

        favorites.merge("Jenny", "Skyride", mapper);
        favorites.merge("Sam", "Skyride", mapper);
        System.out.println(favorites);
    }

}
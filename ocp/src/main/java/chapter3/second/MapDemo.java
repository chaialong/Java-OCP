package chapter3.second;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");

        System.out.println(map.get("koala"));

        for (String key : map.keySet()) {
            System.out.println("key: " + key + "; value: " + map.get(key));
        }
    }
}

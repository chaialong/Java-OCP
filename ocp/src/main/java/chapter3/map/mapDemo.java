package chapter3.map;

import java.util.HashMap;
import java.util.Map;

public class mapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("lion");

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }

}

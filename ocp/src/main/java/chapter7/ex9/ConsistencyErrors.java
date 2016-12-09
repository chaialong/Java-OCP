package chapter7.ex9;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConsistencyErrors {
    public static void main(String[] args) {
        Map<String, Object> map = new ConcurrentHashMap<>();

        map.put("aaa", 123);
        map.put("bbb", 345);

        for (String key : map.keySet()) {
            map.remove(key);
        }
    }
}

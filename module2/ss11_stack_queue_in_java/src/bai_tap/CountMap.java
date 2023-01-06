package bai_tap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountMap {
    public static void main(String[] args) {
        String str = "Hello World hello";
        String[] strings = str.toLowerCase().split("\\s");
        Map<String, Integer> map = new TreeMap<>();
        String key = "";
        Integer value = 1;
        for (String string : strings) {
            key = string;
            if (map.containsKey(key)) {
                value += map.get(key);
                map.put(key, value);
            } else {
                map.put(key, value);
            }
        }
        for (Map.Entry<String, Integer> s : map.entrySet()) {
            System.out.println(s);
        }
    }
}

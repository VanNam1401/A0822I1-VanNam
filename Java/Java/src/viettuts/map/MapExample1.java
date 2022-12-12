package viettuts.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "A");
        map.put(101, "B");
        map.put(102, "C");
        map.put(103, "D");
        map.put(101, "B");
        Set<Integer> set = map.keySet();
        for(Object obj : set){
            System.out.println(obj);
        }
        for(Integer integer : set){
            System.out.println(map.get(integer));
        }

    }
}

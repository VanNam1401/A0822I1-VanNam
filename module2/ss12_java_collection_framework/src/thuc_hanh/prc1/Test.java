package thuc_hanh.prc1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer,String> insertOrder = new LinkedHashMap<>(16,0.75f,false);
        Map<Integer,String> accessOrder = new LinkedHashMap<>(16,0.75f,true);

        insertOrder.put (1,"a");
        insertOrder.put (3,"c");
        insertOrder.put (2,"b");
//        String v = insertOrder.get(3);

        accessOrder.put (1,"a");
        accessOrder.put (3,"c");
        accessOrder.put (2,"b");
//        v = accessOrder.get(3);

        System.out.println(insertOrder);

        System.out.println(accessOrder);
    }
}

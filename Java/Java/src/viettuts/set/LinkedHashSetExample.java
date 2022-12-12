package viettuts.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> linkedHashMap = new LinkedHashSet<>();
        linkedHashMap.add("Java");
        linkedHashMap.add("Python");
        linkedHashMap.add("Java");
        linkedHashMap.add("C++");
        System.out.println("So phan tu trong linkedHashMap : "+ linkedHashMap.size());
        System.out.println("Cac phan tu trong linkedHashMap : "+ linkedHashMap);

    }
}

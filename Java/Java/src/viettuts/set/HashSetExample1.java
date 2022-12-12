package viettuts.set;

import java.util.HashSet;

public class HashSetExample1 {
    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<>();
        setA.add("Java");
        setA.add("Python");
        setA.add("Java");
        setA.add("PHP");
        System.out.println("So phan tu co trong setA: " + setA.size());
        System.out.println("Cac phan tu setA: "+setA);
        System.out.println("setA co chua Java khong? "+ setA.contains("Java"));
        System.out.println("setA co chua C++ khong? "+ setA.contains("C++"));
    }
}

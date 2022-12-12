package viettuts.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> setA = new HashSet<>();
        setA.add("Java");
        setA.add("Python");
        setA.add("Java");
        setA.add("PHP");
        System.out.println("So phan tu cua setA: "+setA.size());
        System.out.println(setA);
        System.out.println("Co chua Java khong: "+ setA.contains("Java"));
        System.out.println("Co chua C++ khong: "+ setA.contains("C++"));
    }
}

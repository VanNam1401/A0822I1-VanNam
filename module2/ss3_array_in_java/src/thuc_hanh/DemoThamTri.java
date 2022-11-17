package thuc_hanh;

import java.util.Arrays;

public class DemoThamTri {
    public static void main(String[] args) {
        //demo than tri
        int a1 = 10;
        change1(a1);
        System.out.println(a1); //10
        //demo tham chieu
        int[] array = {1, 2};
        change3(array);
        System.out.println(Arrays.toString(array));
    }
    static void change1(int a) {
        a++;
        System.out.println("Bien trong method " + a);
    }
    static void change2(int[] arr) {
        arr[0] = 100;
        arr[1] = 200;
        System.out.println("Trong ham: " + Arrays.toString(arr));
    }
    static void change3(int[] arr) {
        arr = new int[]{1000, 2000};
        System.out.println("Trong ham: " + Arrays.toString(arr));
    }
}

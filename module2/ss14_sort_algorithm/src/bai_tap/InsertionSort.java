package bai_tap;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 2};
        int x, pos;
        for (int i = 0; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (0 < pos && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
                System.out.println("vong lap while da chay");
            }
            arr[pos] = x;
            System.out.println("Lan thu " + i + ": " + Arrays.toString(arr));
        }
    }
}

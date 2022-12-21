package demo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 2};
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            flag = false;
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                System.out.println("Lan thu " + i + ": " + Arrays.toString(arr));
            }
        }
    }
}

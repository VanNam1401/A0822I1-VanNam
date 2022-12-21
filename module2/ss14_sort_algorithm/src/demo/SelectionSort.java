package demo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 2};
        for (int i = 0; i < arr.length; i++) {
            int indexMin = i;
            // tim gia tri nho nhat trong day hien hanh
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
                System.out.println("Lan thu " + i + ": " + Arrays.toString(arr));
            }

            // doi cho gia tri nho nhat va pt dau tien cua day hien hanh
            if (indexMin != i) {
                int temp = arr[i];
                arr[i] = arr[indexMin];
                arr[indexMin] = temp;
            }
        }
    }
}

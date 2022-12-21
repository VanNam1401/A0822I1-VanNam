package bai_tap;

import java.util.Arrays;

public class SettingInsert {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 2};
        insertionSort(arr);
    }

    static void insertionSort(int[] list) {
        int x, pos;
        for (int i = 0; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (0 < pos && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
        System.out.println(Arrays.toString(list));
    }

}

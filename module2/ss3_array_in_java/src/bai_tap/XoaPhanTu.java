package bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
    static void deleteElement(int i, int[] arr) {
        for (int j = i; j < arr.length; j++) {
            arr[j] = arr[j + 1];
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 6};
        System.out.print("Nhập giá trị cần xóa: ");
        int value = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                for (int j = i; j < array.length -1; j++) {
                    array[j] = array[j + 1];
                }
//                deleteElement(i, array);
                array[array.length - 1] = 0;
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

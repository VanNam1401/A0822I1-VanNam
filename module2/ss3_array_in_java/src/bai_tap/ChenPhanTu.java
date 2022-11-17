package bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ChenPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vị trí cần chèn: ");
        int index = scanner.nextInt();
        System.out.print("Giá trị cần chèn: ");
        int value = scanner.nextInt();
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < 5; i++) {
            System.out.print("Phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        for (int i = array.length - 1; i >= index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        System.out.println(Arrays.toString(array));
    }
}

package bai_tap;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Nhập phần tử cho mảng: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
//        for (int i = 1; i < size; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        }
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);
    }
}

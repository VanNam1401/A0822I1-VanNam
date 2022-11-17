package bai_tap;

import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("List array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Nhập cột cần tính giá trị: ");
        int value = scanner.nextInt();
        int sumValue = 0;
        for (int i = 0; i < row; i++) {
            sumValue += array[i][value - 1];
        }
        System.out.println("Tổng giá trị cột " + value + " là: " + sumValue);
    }
}

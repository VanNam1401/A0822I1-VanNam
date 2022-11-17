package bai_tap;

import java.util.Scanner;

public class SumCheoArrayVuong {
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
        int sumCX = 0;
        int sumCN = 0;
        if (row == col) {
            for (int i = 0; i < array.length; i++) {
                sumCX += array[i][i];
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (i + j + 1 == array.length) {
                        sumCN += array[i][j];
                    }
                }
            }
        } else {
            System.out.println("Không phải ma trận vuông");
        }
        System.out.println("Sum Xuôi = " + sumCX);
        System.out.println("Sum Ngược = " + sumCN);
    }
}

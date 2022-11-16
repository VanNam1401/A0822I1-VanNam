package bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tien (USD): ");
        int dollar = scanner.nextInt();
        int rate = dollar * 23000;
        System.out.println("Chuyen doi sang VND: " + rate);
    }
}

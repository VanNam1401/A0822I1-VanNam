package bai_tap;

import java.util.Scanner;

public class SoLanXuatHien {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi ky tu: ");
        String str = scanner.nextLine();
        char str2 = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str2 == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("So lan xuat hien cua " + str2 + " la: " + count);
    }
}

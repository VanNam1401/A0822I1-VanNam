package thuc_hanh;

import java.util.Scanner;

public class Hello {
    int i; // thuộc tính, biến toàn cục, biến instance
    final float PI_NEW = 3.14f;

    public static void main(String[] args) {
        System.out.println("Hello A08");
        System.out.printf("%d abc %s", 10, "Codegym");
        System.out.println("\n");
        int i = 10;
        float f = 10.0f;
        double d = 10.d;
        String s = "hello";
        System.out.println(i);
        Hello hello = new Hello();
        System.out.println(hello.i);
        final float PI = 3.14f;
        int i1 = 10;
        int i2 = 10;
        System.out.println(i1 == i2);
        int [] arr1 = {1, 2};
        System.out.println(arr1); //in ra địa chỉ ô nhớ
        int[] arr2 = {1, 2};
        System.out.println(arr2); //in ra địa chỉ ô nhớ
        System.out.println(arr1 == arr2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so:");
        int point = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao ten");
        String name = scanner.nextLine();
        System.out.println("Diem vua nhap la " + point);
        System.out.println("ten vua nhap la " + name);
        if (point > 0) {
            System.out.println("pass module");
        } else {
            System.out.println("fail");
        }

        switch (point) {
            case  1:
                System.out.println("mot");
                break;
            case 2:
                System.out.println("hai");
            default:
                System.out.println("khong phai la so");
        }
    }
}

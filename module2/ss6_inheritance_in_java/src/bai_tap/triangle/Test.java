package bai_tap.triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào cạnh 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Nhập vào cạnh 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Nhập vào cạnh 3: ");
        double side3 = scanner.nextDouble();
        System.out.print("Màu sắc của tam giác: ");
        String str = scanner.next();
        Triangle triangle = new Triangle(str, true, side1, side2, side3);
        System.out.println(triangle.toString());
//        Triangle triangle1 = new Shape();
        Shape shape = new Triangle();
    }
}

package bai_tap;

import java.util.Scanner;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void checkTriangle() throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            if ((a + b < c) || (a + c < b) || (b + c < a)) {
                throw new IllegalTriangleException("Không phải ba canh tam giác");
            }
        }
        System.out.println("this is triangle");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        Triangle triangle = new Triangle(a, b, c);
        try {
            triangle.checkTriangle();
        } catch (IllegalTriangleException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

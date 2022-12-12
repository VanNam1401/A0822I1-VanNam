package viettuts;

import java.util.Scanner;

public class BaiTap1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập hệ số bậc 2, a = ");
        float a = BaiTap1.scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = BaiTap1.scanner.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = scanner.nextFloat();
        giaiPhuongTrinhBac2(a,b,c);

    }

    public static void giaiPhuongTrinhBac2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                System.out.println("Phuong trinh co 1 nghiem x: " + (-c / b));
            }
            return;
        }
        float denta = b * b - 4 * a * c;
        float x1;
        float x2;
        if (denta > 0) {
            x1 = (float) ((-b - Math.sqrt(denta)) / (2 * a));
            x2 = (float) ((-b + Math.sqrt(denta)) / (2 * a));
            System.out.println("Phuong trinh co 2 nghiem x1 =" + x1 + "x2" + x2);
        } else if (denta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co 1 nghiem ket x=" + x1);
        }

    }
}

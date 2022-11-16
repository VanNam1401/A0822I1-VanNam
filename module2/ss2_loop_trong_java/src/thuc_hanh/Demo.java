package thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int[] numArray1 = {1, 10, 20, 30};
        int numArray2[] = new int[10];
        String[] strings = new String[5];
        System.out.println(Arrays.toString(strings));
        // dung for thuong de duyet mang.
        for (int i = 0; i < numArray1.length; i++) {
            System.out.println("phan tu thu : " + i + " la:" + numArray1[i] + "\n");
        }
        System.out.println(Arrays.toString(numArray1));
        for (int i = 0; i < numArray1.length; i++) {
            numArray1[i] = 100;
        }
        System.out.println(Arrays.toString(numArray1));
        //Cach 1
        int[][] number1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        //cach 2
        //khởi tạo mảng 2 chiều gồn 3 hàng và 3 cột
        Scanner scanner = new Scanner(System.in);
        int[][] number2 = new int[3][3];
        for (int i = 0; i < number2.length; i++) {
            for (int j = 0; j < number2[i].length; j++) {
                System.out.println("Nhap phan tu thu " + i + "-" + j);
                number2[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        //in ra mang 2 chieu
        for (int i = 0; i < number2.length; i++) {
            for (int j = 0; j < number2[i].length; j++) {
                System.out.println(number2[i][j]);
            }
            System.out.println("\n");
        }
    }
}

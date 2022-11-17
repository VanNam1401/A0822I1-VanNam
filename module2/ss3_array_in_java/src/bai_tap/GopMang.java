package bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrA = new int[5];
        int[] arrB = new int[5];
        System.out.println("Nhập giá trị mảng A: ");
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = scanner.nextInt();
        }
        System.out.println("Nhập giá trị mảng B: ");
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = scanner.nextInt();
        }
        int[] arrC = new int[arrA.length + arrB.length];

        for (int i = 0; i < arrA.length; i++) {
            arrC[i] = arrA[i];
        }
        int index = arrB.length;
        for (int i = 0; i < arrB.length; i++) {
            arrC[index] = arrB[i];
            index++;
        }
//        System.arraycopy(arrA, 0, arrC, 0, arrA.length);
//        System.arraycopy(arrB, 0, arrC, arrB.length, arrB.length);
        System.out.println(Arrays.toString(arrC));
    }
}

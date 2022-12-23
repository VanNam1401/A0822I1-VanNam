package bai_tap;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        nhiPhan(number);
    }

    static void nhiPhan(int number) {
        Stack<Integer> array = new Stack<>();
        if (number == 0) {
            array.add(0);
        } else if (number != 0) {
            nhiPhan(number / 2);
            array.add(number % 2);
        }
        for (Integer integer : array) {
            System.out.print(integer);
        }
    }
}

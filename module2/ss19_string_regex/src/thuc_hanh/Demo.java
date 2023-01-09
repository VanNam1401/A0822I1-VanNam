package thuc_hanh;

import java.util.Scanner;

public class Demo {

    public static boolean validate() {
        String regex = "\\d+";
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        return x.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println(validate());
    }
}

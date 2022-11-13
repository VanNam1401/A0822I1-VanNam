package thuc_hanh;

import java.util.Scanner;

public class ChiSoCanNangCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Your weight (in kilogram): ");
        weight = scanner.nextDouble();
        System.out.println("Your height (int meter): ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.println("Interpretation");
        if (bmi < 18) {
            System.out.println("Underweight: " + bmi);
        } else if (bmi < 25.0) {
            System.out.println("Normal " + bmi);
        } else if (bmi < 30.0) {
            System.out.println("Overweight: " + bmi);
        } else {
            System.out.println("Obese: " + bmi);
        }
    }
}

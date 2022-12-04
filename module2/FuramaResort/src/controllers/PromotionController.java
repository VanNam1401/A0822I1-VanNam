package controllers;

import java.util.Scanner;

public class PromotionController {
    private int chooseFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chọn chức năng: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private void executionFunction() {
        switch (chooseFunction()) {
            case 1:
                System.out.println("Display list customer use service: ");
                return;
            case 2:
                System.out.println("Display list get voucher: ");
                break;
            case 3:
                System.out.println("Return main menu ");
                break;
            default:
                while (chooseFunction() <= 0 || chooseFunction() > 4) {
                    displayMainMenu();
                }
        }
    }

    public void displayMainMenu() {
        do {
            System.out.println(
                    " 1. Display list facility " +
                            "\n 2. Add new facility" +
                            "\n 3. Display list facility maintenance" +
                            "\n 4. Return main menu");
            executionFunction();
        } while (true);
    }
}

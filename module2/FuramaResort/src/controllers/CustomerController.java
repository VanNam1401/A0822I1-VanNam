package controllers;

import java.util.Scanner;

public class CustomerController {
    private int chooseFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chọn chức năng: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private void executionFunction() {
        switch (chooseFunction()) {
            case 1:
                System.out.println("Display list customer: ");
                return;
            case 2:
                System.out.println("Add new customer: ");
                break;
            case 3:
                System.out.println("Edit customer: ");
                break;
            case 4:
                System.out.println("Return main menu: ");
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
                    " 1. Display list customers " +
                            "\n 2. Add new customer" +
                            "\n 3. Edit customer " +
                            "\n 4. Return main menu");
            executionFunction();
        } while (true);
    }
}

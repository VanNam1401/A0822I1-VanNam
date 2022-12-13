package controllers;

import java.util.Scanner;

public class EmployeeController {
    private int chooseFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chọn chức năng: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private void executionFunction() {
        switch (chooseFunction()) {
            case 1:
                System.out.println("Display list employees: ");
                break;
            case 2:
                System.out.println("Add new employee: ");
                break;
            case 3:
                System.out.println("Edit employee: ");
                break;
            case 4:
//                System.out.println("Return main menu: ");
                new FuramaController().displayMainMenu();
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
                    " 1. Display list employees " +
                            "\n 2. Add new employee" +
                            "\n 3. Edit employee " +
                            "\n 4. Return main menu");
            executionFunction();
        } while (true);
    }
}

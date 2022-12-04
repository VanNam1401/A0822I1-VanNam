package controllers;

import java.util.Scanner;

public class FacilityController {
    private int chooseFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chọn chức năng: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private void executionFunction() {
        switch (chooseFunction()) {
            case 1:
                System.out.println("Display list facility: ");
                return;
            case 2:
                System.out.println("Add new facility: ");
                break;
            case 3:
                System.out.println("Display list facility maintenance: ");
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
                    " 1. Display list facility " +
                            "\n 2. Add new facility" +
                            "\n 3. Display list facility maintenance" +
                            "\n 4. Return main menu");
            executionFunction();
        } while (true);
    }
}

package controllers;

import java.util.Scanner;

public class EmployeeManagement {
    private static final Scanner scanner = new Scanner(System.in);

    public void employeeMenu() {
        System.out.println("1. Display list employees" +
                "\n2. Add new employee" +
                "\n3. Edit employee" +
                "\n4. Return main menu");
        int choice = getChoice();
        switch (choice) {
            case 1 -> {

            }
            case 2 -> {

            }
            case 3 -> {

            }
            case 4 -> {
                new FuramaController().displayMainMenu();
            }
        }
    }

    private int getChoice() {
        int choice = -1;
        try {
            System.out.print("Enter choice 1 -> 4: ");
            choice = Integer.parseInt(scanner.nextLine());
            while (choice < 1 || choice > 4) {
                System.out.print("Enter choice again: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
        } catch (Exception e) {
            employeeMenu();
        }
        return choice;
    }
}

package controllers;

import java.util.Scanner;

public class CustomerManagement {
    private static final Scanner scanner = new Scanner(System.in);

    public void customerMenu() {
        while (true) {
            System.out.println("1. Display list customers" +
                    "\n2. Add new customer" +
                    "\n3. Edit customer" +
                    "\n4. Return main menu");
            int choise = getChoice();
            switch (choise) {
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
    }
    private int getChoice() {
        int choice = -1;
        try {
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            while (choice < 1 || choice > 4) {
                System.out.print("Enter choice again: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
        }catch (Exception e) {
            customerMenu();
        }
        return choice;
    }
}

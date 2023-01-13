package controllers;

import java.util.Scanner;

public class PromotionManagement {
    private static final Scanner scanner = new Scanner(System.in);

    public void promotionMenu() {
        System.out.println("1. Display list customers use service" +
                "\n2. Display list customers get voucher" +
                "\n3. Return main menu");
        int choice = getChoice();
        switch (choice) {
            case 1 -> {

            }
            case 2 -> {

            }
            case 3 -> {
                new FuramaController().displayMainMenu();
            }
        }
    }

    private int getChoice() {

        int choice = -1;
        try {
            System.out.print("Enter choice 1 -> 3: ");
            choice = Integer.parseInt(scanner.nextLine());
            while (choice < 1 || choice > 3) {
                System.out.print("Enter choice again: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
        } catch (Exception e) {
            promotionMenu();
        }
        return choice;
    }
}

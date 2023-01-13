package controllers;

import java.util.Scanner;

public class FacilityManagement {
    private final static Scanner scanner = new Scanner(System.in);

    public void facilityMenu() {
        System.out.println("1. Display list facility" +
                "\n2. Add new facility" +
                "\n3. Display list facility maintenance" +
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
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            while (choice < 1 || choice > 4) {
                System.out.print("Enter choice again: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
        } catch (Exception e) {
            facilityMenu();
        }
        return choice;
    }
}
